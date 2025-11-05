<?xml version="1.0" encoding="UTF-8"?>
<jasperReport
	xmlns="http://jasperreports.sourceforge.net/jasperreports"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="TTI6010LCAmd_KeyLCTerms" pageWidth="495" pageHeight="842" whenNoDataType="NoPages" columnWidth="495" leftMargin="0" rightMargin="0" topMargin="0" bottomMargin="0" resourceBundle="i18n" whenResourceMissingType="Empty" uuid="a1b2c3d4-e5f6-47a8-b1c2-d3e4f5a6b7c8">
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
					<reportElement x="1" y="0" width="494" height="20" uuid="e1f2a3b4-c5d6-47e8-9fa0-1b2c3d4e5f6g"/>
					<textElement verticalAlignment="Top">
						<font size="10" isBold="true"/>
					</textElement>
					<textFieldExpression>
						<![CDATA[$R{text.KeyLCTerms}]]>
					</textFieldExpression>
				</textField>
				<!-- ROW 1: Your Reference (STRIKE) + Bank Reference -->
				<textField>
					<reportElement style="TradeTI-Label" x="1" y="21" width="120" height="20" uuid="a1b2c3d4-c5d6-47e8-9fa0-1b2c3d4e5f6a"/>
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
					<reportElement style="TradeTI-Data" x="121" y="21" width="119" height="20" forecolor="#666666" uuid="b2c3d4e5-d6e7-48f9-a0b1-2c3d4e5f6a7b">
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
					<reportElement style="TradeTI-Data" x="121" y="21" width="119" height="20" uuid="c3d4e5f6-e7f8-49a0-b1c2-3d4e5f6a7b8c">
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
					<reportElement style="TradeTI-Label" x="240" y="21" width="118" height="20" uuid="d4e5f6a7-f8a9-4a0b-c1d2-4e5f6a7b8c9d"/>
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
					<reportElement style="TradeTI-Data" x="358" y="21" width="137" height="20" uuid="e5f6a7b8-a9b0-4b1c-d2e3-5f6a7b8c9d0e"/>
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
					<reportElement style="TradeTI-Label" x="1" y="42" width="120" height="20" uuid="f6a7b8c9-b0c1-4c2d-e3f4-6a7b8c9d0e1f"/>
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
					<reportElement style="TradeTI-Data" x="121" y="42" width="119" height="20" uuid="a7b8c9d0-c1d2-4d3e-f4a5-7b8c9d0e1f2g"/>
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
					<reportElement style="TradeTI-Label" x="240" y="42" width="118" height="20" uuid="b8c9d0e1-d2e3-4e4f-a5b6-8c9d0e1f2a3h"/>
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
					<reportElement style="TradeTI-Data" x="358" y="42" width="137" height="20" forecolor="#666666" uuid="c9d0e1f2-e3f4-4f5g-b6c7-9d0e1f2a3b4i">
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
					<reportElement style="TradeTI-Data" x="358" y="42" width="137" height="20" uuid="d0e1f2a3-f4a5-4a6h-c7d8-0e1f2a3b4c5j">
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
					<reportElement style="TradeTI-Label" x="1" y="63" width="120" height="20" uuid="e1f2a3b4-a5b6-4b7i-d8e9-1f2a3b4c5d6e"/>
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
					<reportElement style="TradeTI-Data" x="121" y="63" width="374" height="20" uuid="f2a3b4c5-b6c7-4c8j-e9f0-2a3b4c5d6e7f"/>
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
					<reportElement style="TradeTI-Label" x="1" y="84" width="120" height="20" uuid="a3b4c5d6-c7d8-4d9k-f0a1-3b4c5d6e7f8g"/>
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
					<reportElement style="TradeTI-Data" x="121" y="84" width="119" height="20" uuid="b4c5d6e7-d8e9-4e0l-a1b2-4c5d6e7f8a9h"/>
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
					<reportElement style="TradeTI-Label" x="240" y="84" width="118" height="20" uuid="c5d6e7f8-e9f0-4f1m-b2c3-5d6e7f8a9b0i"/>
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
					<reportElement style="TradeTI-Data" x="358" y="84" width="137" height="20" forecolor="#666666" uuid="d6e7f8a9-f0a1-4a2n-c3d4-6e7f8a9b0c1j">
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
					<reportElement style="TradeTI-Data" x="358" y="84" width="137" height="20" uuid="e7f8a9b0-a1b2-4b3o-d4e5-7f8a9b0c1d2k">
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
					<reportElement style="TradeTI-Label" x="1" y="105" width="120" height="20" uuid="f8a9b0c1-b2c3-4c4p-e5f6-8a9b0c1d2e3l"/>
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
					<reportElement style="TradeTI-Data" x="121" y="105" width="119" height="20" forecolor="#666666" uuid="a9b0c1d2-c3d4-4d5q-f6a7-9b0c1d2e3f4m">
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
					<reportElement style="TradeTI-Data" x="121" y="105" width="119" height="20" uuid="b0c1d2e3-d4e5-4e6r-a7b8-0c1d2e3f4a5n">
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
					<reportElement style="TradeTI-Label" x="240" y="105" width="118" height="20" uuid="c1d2e3f4-e5f6-4f7s-b8c9-1d2e3f4a5b6o"/>
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
					<reportElement style="TradeTI-Data" x="358" y="105" width="137" height="20" uuid="d2e3f4a5-f6a7-4a8t-c9d0-2e3f4a5b6c7p"/>
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
					<reportElement style="TradeTI-Label" x="1" y="126" width="120" height="20" uuid="e3f4a5b6-a7b8-4b9u-d0e1-3f4a5b6c7d8q"/>
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
					<reportElement style="TradeTI-Data" x="121" y="126" width="119" height="20" uuid="f4a5b6c7-b8c9-4c0v-e1f2-4a5b6c7d8e9r"/>
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
					<reportElement style="TradeTI-Label" x="240" y="126" width="118" height="20" uuid="a5b6c7d8-c9d0-4d1w-f2a3-5b6c7d8e9f0s"/>
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
					<reportElement style="TradeTI-Data" x="358" y="126" width="137" height="20" uuid="b6c7d8e9-d0e1-4e2x-a3b4-6c7d8e9f0a1t"/>
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
					<reportElement style="TradeTI-Label" x="1" y="147" width="120" height="20" uuid="c7d8e9f0-d9e0-4e3y-b4c5-7d8e9f0a1b2u"/>
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
					<reportElement style="TradeTI-Data" x="121" y="147" width="119" height="20" uuid="d8e9f0a1-e0f1-4f4z-c5d6-8e9f0a1b2c3v"/>
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
					<reportElement style="TradeTI-Label" x="240" y="147" width="118" height="20" uuid="e9f0a1b2-f1a2-4a5aa-d6e7-9f0a1b2c3d4w"/>
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
					<reportElement style="TradeTI-Data" x="358" y="147" width="137" height="20" uuid="f0a1b2c3-a2b3-4b6ab-e7f8-0a1b2c3d4e5x"/>
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
					<reportElement style="TradeTI-Label" x="1" y="168" width="120" height="20" uuid="a1b2c3d4-b3c4-4c7ac-f8a9-1b2c3d4e5f6y"/>
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
					<reportElement style="TradeTI-Data" x="121" y="168" width="374" height="20" forecolor="#666666" uuid="b2c3d4e5-c4d5-4d8ad-a9b0-2c3d4e5f6a7z">
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
					<reportElement style="TradeTI-Data" x="121" y="168" width="374" height="20" uuid="c3d4e5f6-d5e6-4e9ae-b0c1-3d4e5f6a7b8aa">
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
					<reportElement style="TradeTI-Label" x="1" y="189" width="120" height="20" uuid="d4e5f6a7-e6f7-4f0af-c1d2-4e5f6a7b8c9ab"/>
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
					<reportElement style="TradeTI-Data" x="121" y="189" width="119" height="20" forecolor="#666666" uuid="e5f6a7b8-f7a8-4a1ag-d2e3-5f6a7b8c9d0ac">
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
					<reportElement style="TradeTI-Data" x="121" y="189" width="119" height="20" uuid="f6a7b8c9-a8b9-4b2ah-e3f4-6a7b8c9d0e1ad">
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
					<reportElement style="TradeTI-Label" x="240" y="189" width="118" height="20" uuid="a7b8c9d0-b9ca-4c3ai-f4a5-7b8c9d0e1f2ae"/>
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
					<reportElement style="TradeTI-Data" x="358" y="189" width="137" height="20" uuid="b8c9d0e1-caca-4d4aj-a5b6-8c9d0e1f2a3af"/>
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
					<reportElement style="TradeTI-Label" x="1" y="210" width="120" height="20" uuid="c9d0e1f2-cacb-4e5ak-b6c7-9d0e1f2a3b4ag"/>
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
					<reportElement style="TradeTI-Data" x="121" y="210" width="119" height="20" forecolor="#666666" uuid="d0e1f2a3-cbcc-4f6al-c7d8-0e1f2a3b4c5ah">
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
					<reportElement style="TradeTI-Data" x="121" y="210" width="119" height="20" uuid="e1f2a3b4-cccd-4a7am-d8e9-1f2a3b4c5d6ai">
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
					<reportElement style="TradeTI-Label" x="240" y="210" width="118" height="20" uuid="f2a3b4c5-cdce-4b8an-e9f0-2a3b4c5d6e7aj"/>
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
					<reportElement style="TradeTI-Data" x="358" y="210" width="137" height="20" uuid="a3b4c5d6-cece-4c9ao-f0a1-3b4c5d6e7f8ak"/>
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
					<reportElement style="TradeTI-Label" x="1" y="231" width="120" height="20" uuid="b4c5d6e7-cfcf-4d0ap-a1b2-4c5d6e7f8a9al"/>
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
					<reportElement style="TradeTI-Data" x="121" y="231" width="119" height="20" uuid="c5d6e7f8-d0d0-4e1aq-b2c3-5d6e7f8a9b0am"/>
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
					<reportElement style="TradeTI-Label" x="240" y="231" width="118" height="20" uuid="d6e7f8a9-d1d1-4f2ar-c3d4-6e7f8a9b0c1an"/>
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
					<reportElement style="TradeTI-Data" x="358" y="231" width="137" height="20" uuid="e7f8a9b0-d2d2-4a3as-d4e5-7f8a9b0c1d2ao"/>
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
					<reportElement style="TradeTI-Label" x="1" y="252" width="120" height="40" uuid="f8a9b0c1-d3d3-4b4at-e5f6-8a9b0c1d2e3ap"/>
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
					<reportElement style="TradeTI-Data" x="121" y="252" width="374" height="40" uuid="a9b0c1d2-d4d4-4c5au-f6a7-9b0c1d2e3f4aq"/>
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
					<reportElement style="TradeTI-Label" x="1" y="293" width="120" height="20" uuid="b0c1d2e3-d5d5-4d6av-a1b2-0c1d2e3f4a5ar"/>
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
					<reportElement style="TradeTI-Data" x="121" y="293" width="119" height="20" forecolor="#666666" uuid="c1d2e3f4-d6d6-4e7aw-b2c3-1d2e3f4a5b6as">
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
					<reportElement style="TradeTI-Data" x="121" y="293" width="119" height="20" uuid="d2e3f4a5-d7d7-4f8ax-c3d4-2e3f4a5b6c7at">
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
					<reportElement style="TradeTI-Label" x="240" y="293" width="118" height="20" uuid="e3f4a5b6-d8d8-4a9ay-d4e5-3f4a5b6c7d8au"/>
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
					<reportElement style="TradeTI-Data" x="358" y="293" width="137" height="20" uuid="f4a5b6c7-d9d9-4b0az-e5f6-4a5b6c7d8e9av"/>
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
					<reportElement style="TradeTI-Label" x="1" y="314" width="120" height="20" uuid="a5b6c7d8-dadb-4c1ba-f6a7-5b6c7d8e9f0aw"/>
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
					<reportElement style="TradeTI-Data" x="121" y="314" width="119" height="20" forecolor="#666666" uuid="b6c7d8e9-dbdc-4d2bb-a7b8-6c7d8e9f0a1ax">
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
					<reportElement style="TradeTI-Data" x="121" y="314" width="119" height="20" uuid="c7d8e9f0-dcdd-4e3cc-b8c9-7d8e9f0a1b2ay">
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
					<reportElement style="TradeTI-Label" x="240" y="314" width="118" height="20" uuid="d8e9f0a1-dede-4f4dd-c9d0-8e9f0a1b2c3az"/>
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
					<reportElement style="TradeTI-Data" x="358" y="314" width="137" height="20" uuid="e9f0a1b2-dfdf-4a5ee-d0e1-9f0a1b2c3d4ba"/>
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
					<reportElement style="TradeTI-Label" x="1" y="335" width="120" height="20" uuid="f0a1b2c3-e0e0-4b6ef-e1f2-0a1b2c3d4e5cb"/>
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
					<reportElement style="TradeTI-Data" x="121" y="335" width="119" height="20" forecolor="#666666" uuid="a1b2c3d4-e1e1-4c7fg-f2a3-1b2c3d4e5f6dc">
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
					<reportElement style="TradeTI-Data" x="121" y="335" width="119" height="20" uuid="b2c3d4e5-e2e2-4d8gh-a3b4-2c3d4e5f6a7ed">
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
					<reportElement style="TradeTI-Label" x="240" y="335" width="118" height="20" uuid="c3d4e5f6-e3e3-4e9hi-b4c5-3d4e5f6a7b8fe"/>
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
					<reportElement style="TradeTI-Data" x="358" y="335" width="137" height="20" forecolor="#666666" uuid="d4e5f6a7-e4e4-4f0ij-c5d6-4e5f6a7b8c9gf">
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
					<reportElement style="TradeTI-Data" x="358" y="335" width="137" height="20" uuid="e5f6a7b8-e5e5-4a1jk-d6e7-5f6a7b8c9d0hg">
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
					<reportElement style="TradeTI-Label" x="1" y="356" width="120" height="20" uuid="f6a7b8c9-e6e6-4b2kl-e7f8-6a7b8c9d0e1ih"/>
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
					<reportElement style="TradeTI-Data" x="121" y="356" width="119" height="20" uuid="a7b8c9d0-e7e7-4c3lm-f8a9-7b8c9d0e1f2ji"/>
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
					<reportElement style="TradeTI-Label" x="240" y="356" width="118" height="20" uuid="b8c9d0e1-e8e8-4d4mn-a9b0-8c9d0e1f2a3kj"/>
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
					<reportElement style="TradeTI-Data" x="358" y="356" width="137" height="20" forecolor="#666666" uuid="c9d0e1f2-e9e9-4e5no-b0c1-9d0e1f2a3b4lk">
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
					<reportElement style="TradeTI-Data" x="358" y="356" width="137" height="20" uuid="d0e1f2a3-eaea-4f6op-c1d2-0e1f2a3b4c5ml">
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
					<reportElement style="TradeTI-Label" x="1" y="377" width="120" height="20" uuid="e1f2a3b4-ebeb-4a7pq-d2e3-1f2a3b4c5d6nm"/>
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
					<reportElement style="TradeTI-Data" x="121" y="377" width="119" height="20" forecolor="#666666" uuid="f2a3b4c5-ecec-4b8qr-e3f4-2a3b4c5d6e7on">
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
					<reportElement style="TradeTI-Data" x="121" y="377" width="119" height="20" uuid="a3b4c5d6-eded-4c9rs-f4a5-3b4c5d6e7f8po">
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
					<reportElement style="TradeTI-Label" x="240" y="377" width="118" height="20" uuid="b4c5d6e7-eeee-4d0st-a5b6-4c5d6e7f8a9qp"/>
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
					<reportElement style="TradeTI-Data" x="358" y="377" width="137" height="20" uuid="c5d6e7f8-efef-4e1tu-b6c7-5d6e7f8a9b0rq"/>
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
					<reportElement style="TradeTI-Label" x="1" y="398" width="120" height="40" uuid="d6e7f8a9-f0f0-4f2uv-c7d8-6e7f8a9b0c1sr"/>
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
					<reportElement style="TradeTI-Data" x="121" y="398" width="374" height="40" forecolor="#666666" uuid="e7f8a9b0-f1f1-4a3vw-d8e9-7f8a9b0c1d2ts">
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
					<reportElement style="TradeTI-Data" x="121" y="398" width="374" height="40" uuid="f8a9b0c1-f2f2-4b4wx-e9f0-8a9b0c1d2e3ut">
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
