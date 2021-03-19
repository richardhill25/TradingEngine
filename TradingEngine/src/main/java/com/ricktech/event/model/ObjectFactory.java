
package com.ricktech.event.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ricktech.event.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Period_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "period");
    private final static QName _EquityExpirationTimeType_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "equityExpirationTimeType");
    private final static QName _SendTo_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "sendTo");
    private final static QName _SettlementType_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "settlementType");
    private final static QName _UnadjustedDate_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "unadjustedDate");
    private final static QName _ClosingLevel_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "closingLevel");
    private final static QName _SequenceNumber_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "sequenceNumber");
    private final static QName _IsCorrection_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "isCorrection");
    private final static QName _VarianceStrikePrice_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "varianceStrikePrice");
    private final static QName _TradeDate_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "tradeDate");
    private final static QName _SettlementCurrency_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "settlementCurrency");
    private final static QName _MasterConfirmationAnnexDate_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "masterConfirmationAnnexDate");
    private final static QName _DayType_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "dayType");
    private final static QName _VegaNotionalAmount_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "vegaNotionalAmount");
    private final static QName _FuturesPriceValuation_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "futuresPriceValuation");
    private final static QName _BusinessDayConvention_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "businessDayConvention");
    private final static QName _AutomaticExercise_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "automaticExercise");
    private final static QName _VarianceCap_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "varianceCap");
    private final static QName _Description_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "description");
    private final static QName _SentBy_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "sentBy");
    private final static QName _MultipleExchangeIndexAnnexFallback_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "multipleExchangeIndexAnnexFallback");
    private final static QName _MasterConfirmationDate_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "masterConfirmationDate");
    private final static QName _OptionType_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "optionType");
    private final static QName _MasterConfirmationAnnexType_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "masterConfirmationAnnexType");
    private final static QName _Currency_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "currency");
    private final static QName _PeriodMultiplier_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "periodMultiplier");
    private final static QName _CreationTimestamp_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "creationTimestamp");
    private final static QName _PartyName_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "partyName");
    private final static QName _MasterConfirmationType_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "masterConfirmationType");
    private final static QName _ExpectedN_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "expectedN");
    private final static QName _PartyId_QNAME = new QName("http://www.fpml.org/FpML-5/confirmation", "partyId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ricktech.event.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DateRelativeTo }
     * 
     */
    public DateRelativeTo createDateRelativeTo() {
        return new DateRelativeTo();
    }

    /**
     * Create an instance of {@link InstrumentId }
     * 
     */
    public InstrumentId createInstrumentId() {
        return new InstrumentId();
    }

    /**
     * Create an instance of {@link MasterConfirmation }
     * 
     */
    public MasterConfirmation createMasterConfirmation() {
        return new MasterConfirmation();
    }

    /**
     * Create an instance of {@link AdjustableDate }
     * 
     */
    public AdjustableDate createAdjustableDate() {
        return new AdjustableDate();
    }

    /**
     * Create an instance of {@link DateAdjustments }
     * 
     */
    public DateAdjustments createDateAdjustments() {
        return new DateAdjustments();
    }

    /**
     * Create an instance of {@link EquityValuation }
     * 
     */
    public EquityValuation createEquityValuation() {
        return new EquityValuation();
    }

    /**
     * Create an instance of {@link SingleUnderlyer }
     * 
     */
    public SingleUnderlyer createSingleUnderlyer() {
        return new SingleUnderlyer();
    }

    /**
     * Create an instance of {@link Index }
     * 
     */
    public Index createIndex() {
        return new Index();
    }

    /**
     * Create an instance of {@link ExchangeId }
     * 
     */
    public ExchangeId createExchangeId() {
        return new ExchangeId();
    }

    /**
     * Create an instance of {@link RelatedExchangeId }
     * 
     */
    public RelatedExchangeId createRelatedExchangeId() {
        return new RelatedExchangeId();
    }

    /**
     * Create an instance of {@link Underlyer }
     * 
     */
    public Underlyer createUnderlyer() {
        return new Underlyer();
    }

    /**
     * Create an instance of {@link ReceiverPartyReference }
     * 
     */
    public ReceiverPartyReference createReceiverPartyReference() {
        return new ReceiverPartyReference();
    }

    /**
     * Create an instance of {@link VarianceSwapTransactionSupplement }
     * 
     */
    public VarianceSwapTransactionSupplement createVarianceSwapTransactionSupplement() {
        return new VarianceSwapTransactionSupplement();
    }

    /**
     * Create an instance of {@link VarianceLeg }
     * 
     */
    public VarianceLeg createVarianceLeg() {
        return new VarianceLeg();
    }

    /**
     * Create an instance of {@link PayerPartyReference }
     * 
     */
    public PayerPartyReference createPayerPartyReference() {
        return new PayerPartyReference();
    }

    /**
     * Create an instance of {@link SettlementDate }
     * 
     */
    public SettlementDate createSettlementDate() {
        return new SettlementDate();
    }

    /**
     * Create an instance of {@link RelativeDate }
     * 
     */
    public RelativeDate createRelativeDate() {
        return new RelativeDate();
    }

    /**
     * Create an instance of {@link Valuation }
     * 
     */
    public Valuation createValuation() {
        return new Valuation();
    }

    /**
     * Create an instance of {@link ValuationDate }
     * 
     */
    public ValuationDate createValuationDate() {
        return new ValuationDate();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link ObservationStartDate }
     * 
     */
    public ObservationStartDate createObservationStartDate() {
        return new ObservationStartDate();
    }

    /**
     * Create an instance of {@link Variance }
     * 
     */
    public Variance createVariance() {
        return new Variance();
    }

    /**
     * Create an instance of {@link VarianceAmount }
     * 
     */
    public VarianceAmount createVarianceAmount() {
        return new VarianceAmount();
    }

    /**
     * Create an instance of {@link Documentation }
     * 
     */
    public Documentation createDocumentation() {
        return new Documentation();
    }

    /**
     * Create an instance of {@link MessageId }
     * 
     */
    public MessageId createMessageId() {
        return new MessageId();
    }

    /**
     * Create an instance of {@link TradeHeader }
     * 
     */
    public TradeHeader createTradeHeader() {
        return new TradeHeader();
    }

    /**
     * Create an instance of {@link PartyTradeIdentifier }
     * 
     */
    public PartyTradeIdentifier createPartyTradeIdentifier() {
        return new PartyTradeIdentifier();
    }

    /**
     * Create an instance of {@link PartyReference }
     * 
     */
    public PartyReference createPartyReference() {
        return new PartyReference();
    }

    /**
     * Create an instance of {@link TradeId }
     * 
     */
    public TradeId createTradeId() {
        return new TradeId();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link EquityPremium }
     * 
     */
    public EquityPremium createEquityPremium() {
        return new EquityPremium();
    }

    /**
     * Create an instance of {@link PaymentAmount }
     * 
     */
    public PaymentAmount createPaymentAmount() {
        return new PaymentAmount();
    }

    /**
     * Create an instance of {@link PaymentDate }
     * 
     */
    public PaymentDate createPaymentDate() {
        return new PaymentDate();
    }

    /**
     * Create an instance of {@link BuyerPartyReference }
     * 
     */
    public BuyerPartyReference createBuyerPartyReference() {
        return new BuyerPartyReference();
    }

    /**
     * Create an instance of {@link Party }
     * 
     */
    public Party createParty() {
        return new Party();
    }

    /**
     * Create an instance of {@link CorrelationId }
     * 
     */
    public CorrelationId createCorrelationId() {
        return new CorrelationId();
    }

    /**
     * Create an instance of {@link ExpirationDate }
     * 
     */
    public ExpirationDate createExpirationDate() {
        return new ExpirationDate();
    }

    /**
     * Create an instance of {@link EquityExercise }
     * 
     */
    public EquityExercise createEquityExercise() {
        return new EquityExercise();
    }

    /**
     * Create an instance of {@link EquityEuropeanExercise }
     * 
     */
    public EquityEuropeanExercise createEquityEuropeanExercise() {
        return new EquityEuropeanExercise();
    }

    /**
     * Create an instance of {@link RequestConfirmation }
     * 
     */
    public RequestConfirmation createRequestConfirmation() {
        return new RequestConfirmation();
    }

    /**
     * Create an instance of {@link Trade }
     * 
     */
    public Trade createTrade() {
        return new Trade();
    }

    /**
     * Create an instance of {@link VarianceOptionTransactionSupplement }
     * 
     */
    public VarianceOptionTransactionSupplement createVarianceOptionTransactionSupplement() {
        return new VarianceOptionTransactionSupplement();
    }

    /**
     * Create an instance of {@link SellerPartyReference }
     * 
     */
    public SellerPartyReference createSellerPartyReference() {
        return new SellerPartyReference();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "period")
    public JAXBElement<String> createPeriod(String value) {
        return new JAXBElement<String>(_Period_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "equityExpirationTimeType")
    public JAXBElement<String> createEquityExpirationTimeType(String value) {
        return new JAXBElement<String>(_EquityExpirationTimeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "sendTo")
    public JAXBElement<String> createSendTo(String value) {
        return new JAXBElement<String>(_SendTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "settlementType")
    public JAXBElement<String> createSettlementType(String value) {
        return new JAXBElement<String>(_SettlementType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "unadjustedDate")
    public JAXBElement<String> createUnadjustedDate(String value) {
        return new JAXBElement<String>(_UnadjustedDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "closingLevel")
    public JAXBElement<String> createClosingLevel(String value) {
        return new JAXBElement<String>(_ClosingLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "sequenceNumber")
    public JAXBElement<String> createSequenceNumber(String value) {
        return new JAXBElement<String>(_SequenceNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "isCorrection")
    public JAXBElement<String> createIsCorrection(String value) {
        return new JAXBElement<String>(_IsCorrection_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "varianceStrikePrice")
    public JAXBElement<String> createVarianceStrikePrice(String value) {
        return new JAXBElement<String>(_VarianceStrikePrice_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "tradeDate")
    public JAXBElement<String> createTradeDate(String value) {
        return new JAXBElement<String>(_TradeDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "settlementCurrency")
    public JAXBElement<String> createSettlementCurrency(String value) {
        return new JAXBElement<String>(_SettlementCurrency_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "masterConfirmationAnnexDate")
    public JAXBElement<String> createMasterConfirmationAnnexDate(String value) {
        return new JAXBElement<String>(_MasterConfirmationAnnexDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "dayType")
    public JAXBElement<String> createDayType(String value) {
        return new JAXBElement<String>(_DayType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "vegaNotionalAmount")
    public JAXBElement<String> createVegaNotionalAmount(String value) {
        return new JAXBElement<String>(_VegaNotionalAmount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "futuresPriceValuation")
    public JAXBElement<String> createFuturesPriceValuation(String value) {
        return new JAXBElement<String>(_FuturesPriceValuation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "businessDayConvention")
    public JAXBElement<String> createBusinessDayConvention(String value) {
        return new JAXBElement<String>(_BusinessDayConvention_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "automaticExercise")
    public JAXBElement<String> createAutomaticExercise(String value) {
        return new JAXBElement<String>(_AutomaticExercise_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "varianceCap")
    public JAXBElement<String> createVarianceCap(String value) {
        return new JAXBElement<String>(_VarianceCap_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "sentBy")
    public JAXBElement<String> createSentBy(String value) {
        return new JAXBElement<String>(_SentBy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "multipleExchangeIndexAnnexFallback")
    public JAXBElement<String> createMultipleExchangeIndexAnnexFallback(String value) {
        return new JAXBElement<String>(_MultipleExchangeIndexAnnexFallback_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "masterConfirmationDate")
    public JAXBElement<String> createMasterConfirmationDate(String value) {
        return new JAXBElement<String>(_MasterConfirmationDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "optionType")
    public JAXBElement<String> createOptionType(String value) {
        return new JAXBElement<String>(_OptionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "masterConfirmationAnnexType")
    public JAXBElement<String> createMasterConfirmationAnnexType(String value) {
        return new JAXBElement<String>(_MasterConfirmationAnnexType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "currency")
    public JAXBElement<String> createCurrency(String value) {
        return new JAXBElement<String>(_Currency_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "periodMultiplier")
    public JAXBElement<String> createPeriodMultiplier(String value) {
        return new JAXBElement<String>(_PeriodMultiplier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "creationTimestamp")
    public JAXBElement<String> createCreationTimestamp(String value) {
        return new JAXBElement<String>(_CreationTimestamp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "partyName")
    public JAXBElement<String> createPartyName(String value) {
        return new JAXBElement<String>(_PartyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "masterConfirmationType")
    public JAXBElement<String> createMasterConfirmationType(String value) {
        return new JAXBElement<String>(_MasterConfirmationType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "expectedN")
    public JAXBElement<String> createExpectedN(String value) {
        return new JAXBElement<String>(_ExpectedN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/confirmation", name = "partyId")
    public JAXBElement<String> createPartyId(String value) {
        return new JAXBElement<String>(_PartyId_QNAME, String.class, null, value);
    }

}
