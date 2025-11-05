<?xml version="1.0" encoding="UTF-8"?>
<jasperReport
	xmlns="http://jasperreports.sourceforge.net/jasperreports"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="TTI6010LCAmd_KeyLCTerms" pageWidth="495" pageHeight="842" whenNoDataType="NoPages" columnWidth="495" leftMargin="0" rightMargin="0" topMargin="0" bottomMargin="0" resourceBundle="i18n" whenResourceMissingType="Empty" uuid="ed2ecd5b-5997-4721-8701-53dc329a4375">
	<property name="ireport.zoom" value="2.0"/>
	<property name="ireport.x" value="0"/>
	<property name="ireport.y" value="0"/>
	<property name="ireport.scriptlethandling" value="0"/>
	<property name="ireport.encoding" value="UTF-8"/>
	<import value="net.sf.jasperreports.engine.*"/>
	<import value="java.util.*"/>
	<import value="net.sf.jasperreports.engine.data.*"/>
	<style name="TradeTI-Data" isDefault="true" isBlankWhenNull="true" fontName="Arial" fontSize="8" pdfFontName="ARIALUNI.TTF"/>
	<style name="TradeTI-Label" mode="Opaque" backcolor="#F5F6F6" markup="styled" isBlankWhenNull="true" fontName="Arial" fontSize="8" pdfFontName="ARIALUNI.TTF"/>
	<!-- PARAMETERS -->
	<parameter name="companyReference" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newCompanyReference" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isCompanyReferenceStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="bankLCReference" class="java.lang.String" isForPrompting="false"/>
	<parameter name="requestBeneConsentValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="transferableLCValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newTransferableLCValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isTransferableLCStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="lcTypeValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="amendmentDate" class="java.lang.String" isForPrompting="false"/>
	<parameter name="confirmationToggleValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newConfirmationToggleValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isConfirmationToggleStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="reimbursementInstruction" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newReimbursementInstruction" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isReimbursementInstructionStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="ttReimbursementAllowed" class="java.lang.String" isForPrompting="false"/>
	<parameter name="lcAmountCCYValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="amountChangeValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="amount" class="java.lang.String" isForPrompting="false"/>
	<parameter name="additionalAmounts" class="java.lang.String" isForPrompting="false"/>
	<parameter name="additionalAmountDesc" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newAdditionalAmountDesc" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isAdditionalAmountsStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="toleranceToggleValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newToleranceToggleValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isToleranceToggleStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="incotermYearValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="availableWithValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newAvailableWithValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isAvailableWithStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="advisingBankName" class="java.lang.String" isForPrompting="false"/>
	<parameter name="advisingBankId" class="java.lang.String" isForPrompting="false"/>
	<parameter name="advisingBankCountryName" class="java.lang.String" isForPrompting="false"/>
	<parameter name="advisingBankAddress" class="java.lang.String" isForPrompting="false"/>
	<parameter name="expiryPlaceValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newExpiryPlaceValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isExpiryPlaceStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="expiryDate" class="java.lang.String" isForPrompting="false"/>
	<parameter name="tenorTypeToggleValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newTenorTypeToggleValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isTenorTypeToggleStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="availableByValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="tenorDays" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newTenorDays" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isTenorDaysStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="tenordraftAtValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newTenordraftAtValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isTenordraftAtStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="draftDetailsValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="presentationDays" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newPresentationDays" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isPresentationDaysStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<parameter name="daysOfPresentationFromValue" class="java.lang.String" isForPrompting="false"/>
	<parameter name="daysOfPresentationFromDetails" class="java.lang.String" isForPrompting="false"/>
	<parameter name="newDaysOfPresentationFromDetails" class="java.lang.String" isForPrompting="false"/>
	<parameter name="isDaysOfPresentationFromDetailsStrikeThrough" class="java.lang.Boolean" isForPrompting="false"/>
	<group name="KEY_LC_TERMS">
		<groupExpression>
			<![CDATA[]]>
		</groupExpression>
		<groupHeader>
			<band height="440" splitType="Stretch">
				<!-- TITLE -->
				<textField>
					<reportElement x="1" y="0" width="494" height="20" uuid="36e395b9-b6d7-41c4-8528-a97f1d074512"/>
					<textElement verticalAlignment="Top">
						<font size="10" isBold="true"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.KeyLCTerms}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 1: Your Reference (STRIKE) + Bank Reference -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="21" width="120" height="20" uuid="1f5e37de-c379-4c9a-942e-54baad2c70de"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.yourReference}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="21" width="119" height="20" forecolor="#666666" uuid="60bccfb1-c723-4b3a-9e91-d73f5a6c9dfa">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isCompanyReferenceStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{companyReference}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="21" width="119" height="20" uuid="f589debb-48e5-4601-8304-d12f4073817d">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isCompanyReferenceStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newCompanyReference}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="21" width="118" height="20" uuid="6842575d-7760-4035-8776-8f3410016cd0"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.bankReference}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="21" width="137" height="20" uuid="e85eec6e-3498-498e-a025-4ecef53f1842"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{bankLCReference}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 2: Request Benef Consent + Transferrable LC (STRIKE) -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="42" width="120" height="20" uuid="519272b1-b8c9-450c-a6e9-81bdfeceb82a"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.requestBeneficiaryConsent}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="42" width="119" height="20" uuid="12e939c0-7b4a-42be-90cc-4bb4e9ad7b65"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{requestBeneConsentValue}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="42" width="118" height="20" uuid="d363f8da-0fcc-46a1-9aa4-20f9bc2fdcf3"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.transferrableLC}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="42" width="137" height="20" forecolor="#666666" uuid="f6e2c756-89c8-4675-83d9-ccad81b4104b">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isTransferableLCStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{transferableLCValue}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="42" width="137" height="20" uuid="37e4d273-362c-442a-940d-0f50c164016d">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isTransferableLCStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newTransferableLCValue}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 3: LC Type (FULL-WIDTH) -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="63" width="120" height="20" uuid="07f25e33-7750-4d27-87e4-bd37fdb1990e"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.lcType}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="63" width="374" height="20" uuid="de1d42cb-a547-47db-86bf-ba412aaed67e"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{lcTypeValue}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 4: Amendment Date + Confirmation (STRIKE) -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="84" width="120" height="20" uuid="f737c390-05dd-4d6d-a29a-1bfdc62819d8"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.amendmentDate}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="84" width="119" height="20" uuid="30975ef8-62ff-4439-9dcb-af4e13fe1d08"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{amendmentDate}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="84" width="118" height="20" uuid="04b7af19-192b-46af-bd48-e60cd83ae340"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.confirmation}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="84" width="137" height="20" forecolor="#666666" uuid="720987ab-fec4-43fd-b7b9-20a80a29457b">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isConfirmationToggleStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{confirmationToggleValue}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="84" width="137" height="20" uuid="afe00fcd-31f9-475f-894c-688e0c60d6d1">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isConfirmationToggleStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newConfirmationToggleValue}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 5: Reimbursement Instructions (STRIKE) + TT Reimbursement -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="105" width="120" height="20" uuid="b1c48eaa-736e-43d7-b600-dad4b37f867a"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.reimbursementInstructions}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="105" width="119" height="20" forecolor="#666666" uuid="37675552-c840-4edd-908e-e6619e6d877b">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isReimbursementInstructionStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{reimbursementInstruction}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="105" width="119" height="20" uuid="a9d96174-6b7a-470d-a4e2-d6ce03a4a3cd">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isReimbursementInstructionStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newReimbursementInstruction}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="105" width="118" height="20" uuid="1778d205-fd94-49cc-80b9-ea1faf3833bc"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.ttReimbursementAllowed}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="105" width="137" height="20" uuid="695c5252-adc3-4423-a64e-e5bbeeb15b7c"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{ttReimbursementAllowed}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 6: LC Amount + Amount Change -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="126" width="120" height="20" uuid="7d2516c0-2706-4bdb-a913-5fcb2c3c1b85"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.lcAmount}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="126" width="119" height="20" uuid="599513a9-7c4e-4dee-9904-307c1f48f71d"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{lcAmountCCYValue}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="126" width="118" height="20" uuid="236a121b-1c23-4d97-a3be-4143d50ac337"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.amountChange}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="126" width="137" height="20" uuid="ab1bfa65-907c-4f09-ae3f-fff362941ce1"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{amountChangeValue}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 7: Amount Value + Additional Amounts Covered -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="147" width="120" height="20" uuid="641df0f5-67f8-4af4-ba0a-6ee8b09f60c9"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.amountValue}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="147" width="119" height="20" uuid="9af5bef2-3bc0-44cb-99ef-4a97ce79f0f4"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{amount}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="147" width="118" height="20" uuid="eaf57fa1-ee0b-48ab-a855-da9d805b4cfa"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.additionalAmountsCovered}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="147" width="137" height="20" uuid="707a22d1-49e4-46c3-84c8-e22bdc4872c8"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{additionalAmounts}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 8: Additional Amounts Description (FULL-WIDTH, STRIKE) -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="168" width="120" height="20" uuid="d47f44c9-2ac4-484e-a6f5-43163ee0e274"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.description}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="168" width="374" height="20" forecolor="#666666" uuid="a9ea5eea-3b00-4c8d-b01a-7bd8b7431c40">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isAdditionalAmountsStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{additionalAmountDesc}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="168" width="374" height="20" uuid="662714a2-69d0-47d5-b8a0-c353427739a7">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isAdditionalAmountsStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newAdditionalAmountDesc}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 9: Tolerance (STRIKE) + Incoterm -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="189" width="120" height="20" uuid="9ff0c8f5-7162-452f-a8a8-ce3ae3d19c5a"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.tolerance}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="189" width="119" height="20" forecolor="#666666" uuid="d133f9ab-5c67-422b-8b20-dc92b1a91b68">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isToleranceToggleStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{toleranceToggleValue}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="189" width="119" height="20" uuid="4a911bfa-4997-4e20-9b08-19ea1a4d6b91">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isToleranceToggleStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newToleranceToggleValue}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="189" width="118" height="20" uuid="90ed59d2-5df1-40bd-8f74-10f69e1dca74"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.incoterm}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="189" width="137" height="20" uuid="aa67cd6e-dd19-49db-a9e5-f80247c5f608"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{incotermYearValue}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 10: Available With (STRIKE) + Bank Name -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="210" width="120" height="20" uuid="ef79d415-feea-4953-8d40-30f4705d4e42"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.availableWith}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="210" width="119" height="20" forecolor="#666666" uuid="a36ff33a-7644-461d-8357-c42f8fe71057">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isAvailableWithStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{availableWithValue}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="210" width="119" height="20" uuid="a123403b-67f2-4ab4-a819-fa05352acbcf">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isAvailableWithStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newAvailableWithValue}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="210" width="118" height="20" uuid="dde61f17-fce7-4b96-9112-9e7285c80690"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.bankName}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="210" width="137" height="20" uuid="584208dd-4a88-42a2-a23d-9cf545b812b3"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{advisingBankName}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 11: Bank ID + Country/Market -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="231" width="120" height="20" uuid="69cf7267-ce2a-4987-a6f7-deea0ca694a2"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.bankId}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="231" width="119" height="20" uuid="2eb42477-cc35-4433-a872-33378a6af967"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{advisingBankId}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="231" width="118" height="20" uuid="b6ba20de-74f4-4770-b0e3-a178bed9cba0"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.countryMarket}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="231" width="137" height="20" uuid="c394c9ee-c67e-485e-b468-c54d5fcf007e"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{advisingBankCountryName}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 12: Bank Address (FULL-WIDTH) -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="252" width="120" height="40" uuid="82140dbb-c335-4a16-bfb0-0f21c0f69eb7"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Top">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.bankAddress}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="252" width="374" height="40" uuid="77c5272e-4e6e-434d-826b-e63f4d40ec0b"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Top">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{advisingBankAddress}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 13: Expiry Place (STRIKE) + Expiry Date -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="293" width="120" height="20" uuid="22bab2f3-c911-4c5f-b91f-cd5655d20c0a"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.expiryPlace}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="293" width="119" height="20" forecolor="#666666" uuid="916594e6-fc84-4e02-b5c6-3d160b5bbf6b">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isExpiryPlaceStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{expiryPlaceValue}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="293" width="119" height="20" uuid="77f43906-524f-4857-bd1a-24bd0f0fa25c">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isExpiryPlaceStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newExpiryPlaceValue}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="293" width="118" height="20" uuid="c0f3a146-ff29-42a8-b3c4-65657195ea38"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.expiryDate}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="293" width="137" height="20" uuid="29f1af4e-195e-4037-b91b-95e45049ba34"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{expiryDate}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 14: Tenor Type (STRIKE) + Available By -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="314" width="120" height="20" uuid="ae89b9ca-926f-4a16-9379-ea716e8e365e"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.tenorType}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="314" width="119" height="20" forecolor="#666666" uuid="180de4d0-fa34-43a8-bd33-19958eb1584f">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isTenorTypeToggleStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{tenorTypeToggleValue}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="314" width="119" height="20" uuid="0914562e-2606-4f9c-aed1-031acb98275d">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isTenorTypeToggleStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newTenorTypeToggleValue}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="314" width="118" height="20" uuid="7e3a2a4f-6ca6-4c75-919d-53f81b22a143"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.availableBy}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="314" width="137" height="20" uuid="6ec4b33a-87c6-46e7-aaa4-71776e8b5570"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{availableByValue}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 15: Tenor Days (STRIKE) + Draft At (STRIKE) -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="335" width="120" height="20" uuid="262f7f1c-de72-43a7-bc3b-d48ccc7d324e"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.tenorDays}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="335" width="119" height="20" forecolor="#666666" uuid="d588d09e-33d8-4870-826a-e9d0bc5ed6a5">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isTenorDaysStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{tenorDays}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="335" width="119" height="20" uuid="038ec655-fc31-4f7d-bbe9-fbb86ec44b63">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isTenorDaysStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newTenorDays}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="335" width="118" height="20" uuid="aa32cd2a-ea97-44c5-9c33-4144ba0927c6"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.draftAt}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="335" width="137" height="20" forecolor="#666666" uuid="b60b1fc9-a792-4c6b-af5e-a512095c12ac">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isTenordraftAtStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{tenordraftAtValue}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="335" width="137" height="20" uuid="47a3f703-655e-4171-a37c-0cf1adf7f2e7">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isTenordraftAtStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newTenordraftAtValue}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 16: Draft Details + Presentation Days (STRIKE) -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="356" width="120" height="20" uuid="cff61775-e289-4f85-9a82-557252e7d521"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.draftDetails}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="356" width="119" height="20" uuid="47a82389-7f15-4ece-acfa-e0d6d16055c0"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{draftDetailsValue}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="356" width="118" height="20" uuid="97922aeb-4c96-4492-bace-b9639306a900"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.presentationDays}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="356" width="137" height="20" forecolor="#666666" uuid="28c8fe15-d11c-417c-9b2c-fe0cbeada6ae">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isPresentationDaysStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{presentationDays}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="358" y="356" width="137" height="20" uuid="5901b406-b4f6-4670-ad0a-d4ae0048b0cc">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isPresentationDaysStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newPresentationDays}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 17: Days of Presentation From (STRIKE) + Reserved Space -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="377" width="120" height="20" uuid="aa9b00c4-cdb1-4e62-8905-eb8d513870b6"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.daysOfPresentationFrom}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="377" width="119" height="20" forecolor="#666666" uuid="37ace3f2-2273-4ade-988e-fa6a5cc05b1a">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isDaysOfPresentationFromStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{daysOfPresentationFromValue}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="377" width="119" height="20" uuid="a6f480b2-feb0-4eff-9caf-de76d93832d8">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isDaysOfPresentationFromStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{daysOfPresentationFromValue}]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Label" x="240" y="377" width="118" height="20" uuid="560b93da-21cf-4254-b8f0-7eb59136d0ff"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[""]]>
					</textFieldExpression>
				</textField>
				<textField>
					<reportElement style="TradeTI-Data" x="358" y="377" width="137" height="20" uuid="6fa05406-2313-4cb4-a3f7-c144e9aa9dd0"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Middle">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[""]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 18: Days of Presentation From Details (FULL-WIDTH, STRIKE) -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="398" width="120" height="40" uuid="796996e4-7e4a-43d9-99f6-9fc1c4c9b114"/>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Top">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.daysOfPresentationFromDetails}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="398" width="374" height="40" forecolor="#666666" uuid="0ccc0e97-139f-47eb-98cc-a255f8cafe2c">
						<printWhenExpression>
							<![CDATA[Boolean.TRUE.equals($P{isDaysOfPresentationFromDetailsStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.0" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Top">
						<font isStrikeThrough="true"/>
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{daysOfPresentationFromDetails}]]>
					</textFieldExpression>
				</textField>
				<textField isBlankWhenNull="true">
					<reportElement style="TradeTI-Data" x="121" y="398" width="374" height="40" uuid="252f417a-e6cf-4798-a276-5399c7fad7a4">
						<printWhenExpression>
							<![CDATA[!Boolean.TRUE.equals($P{isDaysOfPresentationFromDetailsStrikeThrough})]]>
						</printWhenExpression>
					</reportElement>
					<box>
						<pen lineWidth="0.5" lineColor="#C0C0C0"/>
						<topPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<leftPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<bottomPen lineWidth="0.5" lineColor="#C0C0C0"/>
						<rightPen lineWidth="0.5" lineColor="#C0C0C0"/>
					</box>
					<textElement verticalAlignment="Top">
						<paragraph leftIndent="3" rightIndent="3"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$P{newDaysOfPresentationFromDetails}]]>
					</textFieldExpression>
				</textField>
			</band>
		</groupHeader>
	</group>
	<detail>
		<band height="1"/>
	</detail>
</jasperReport>
