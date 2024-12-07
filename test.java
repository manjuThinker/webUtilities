public interface TransactionStepRepository extends JpaRepository<TransactionStep, Long> {

    @Query("SELECT t.initiationRequestId AS initiationRequestId, COUNT(t) AS count " +
           "FROM TransactionStep t " +
           "WHERE t.initiationRequestId IN :initiationRequestIds " +
           "GROUP BY t.initiationRequestId")
    List<InitiationRequestCount> countByInitiationRequestIds(@Param("initiationRequestIds") List<String> initiationRequestIds);

    interface InitiationRequestCount {
        String getInitiationRequestId();
        long getCount();
    }
}



@Service
public class TransactionStepService {

    @Autowired
    private TransactionStepRepository repository;

    public Map<String, Long> getCountsByInitiationRequestIds(List<String> initiationRequestIds) {
        List<TransactionStepRepository.InitiationRequestCount> counts = repository.countByInitiationRequestIds(initiationRequestIds);
        return counts.stream().collect(Collectors.toMap(TransactionStepRepository.InitiationRequestCount::getInitiationRequestId, TransactionStepRepository.InitiationRequestCount::getCount));
    }
}
