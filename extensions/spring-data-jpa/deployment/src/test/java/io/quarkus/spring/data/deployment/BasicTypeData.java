package io.quarkus.spring.data.deployment;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BasicTypeData {

    @Id
    @GeneratedValue
    private Integer id;

    private Long longValue;
    private Integer integerValue;
    private Short shortValue;
    private Character characterValue;
    private Byte byteValue;
    private Double doubleValue;
    private Float floatValue;
    private Boolean booleanValue;
    private BigInteger bigIntegerValue;
    private BigDecimal bigDecimalValue;
    private String stringValue;
    private Locale localeValue;
    private TimeZone timeZoneValue;
    private java.net.URL urlValue;
    private Class classValue;
    private java.util.UUID uuidValue;
    /*
     * private java.sql.Blob blobValue;
     * private java.sql.Clob clobValue;
     * private java.sql.NClob nclobValue;
     */
    private java.util.Date utilDateValue;
    private Calendar calendarValue;
    private java.sql.Date sqlDateValue;
    private java.sql.Time sqlTimeValue;
    private java.sql.Timestamp sqlTimestampValue;
    private LocalDate localDateValue;
    private LocalTime localTimeValue;
    private LocalDateTime localDateTimeValue;
    private OffsetTime offsetTimeValue;
    private OffsetDateTime offsetDateTimeValue;
    private Duration durationValue;
    private Instant instantValue;
    private ZonedDateTime zonedDateTimeValue;

    public Integer getId() {
        return id;
    }

    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    public Short getShortValue() {
        return shortValue;
    }

    public void setShortValue(Short shortValue) {
        this.shortValue = shortValue;
    }

    public Character getCharacterValue() {
        return characterValue;
    }

    public void setCharacterValue(Character characterValue) {
        this.characterValue = characterValue;
    }

    public Byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(Byte byteValue) {
        this.byteValue = byteValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public Float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Float floatValue) {
        this.floatValue = floatValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public BigInteger getBigIntegerValue() {
        return bigIntegerValue;
    }

    public void setBigIntegerValue(BigInteger bigIntegerValue) {
        this.bigIntegerValue = bigIntegerValue;
    }

    public BigDecimal getBigDecimalValue() {
        return bigDecimalValue;
    }

    public void setBigDecimalValue(BigDecimal bigDecimalValue) {
        this.bigDecimalValue = bigDecimalValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Locale getLocaleValue() {
        return localeValue;
    }

    public void setLocaleValue(Locale localeValue) {
        this.localeValue = localeValue;
    }

    public TimeZone getTimeZoneValue() {
        return timeZoneValue;
    }

    public void setTimeZoneValue(TimeZone timeZoneValue) {
        this.timeZoneValue = timeZoneValue;
    }

    public URL getUrlValue() {
        return urlValue;
    }

    public void setUrlValue(URL urlValue) {
        this.urlValue = urlValue;
    }

    public Class getClassValue() {
        return classValue;
    }

    public void setClassValue(Class classValue) {
        this.classValue = classValue;
    }

    public UUID getUuidValue() {
        return uuidValue;
    }

    public void setUuidValue(UUID uuidValue) {
        this.uuidValue = uuidValue;
    }

    /*
     * public Blob getBlobValue() {
     * return blobValue;
     * }
     * 
     * public void setBlobValue(Blob blobValue) {
     * this.blobValue = blobValue;
     * }
     * 
     * public Clob getClobValue() {
     * return clobValue;
     * }
     * 
     * public void setClobValue(Clob clobValue) {
     * this.clobValue = clobValue;
     * }
     * 
     * public NClob getNclobValue() {
     * return nclobValue;
     * }
     * 
     * public void setNclobValue(NClob nclobValue) {
     * this.nclobValue = nclobValue;
     * }
     */
    public Date getUtilDateValue() {
        return utilDateValue;
    }

    public void setUtilDateValue(Date utilDateValue) {
        this.utilDateValue = utilDateValue;
    }

    public Calendar getCalendarValue() {
        return calendarValue;
    }

    public void setCalendarValue(Calendar calendarValue) {
        this.calendarValue = calendarValue;
    }

    public java.sql.Date getSqlDateValue() {
        return sqlDateValue;
    }

    public void setSqlDateValue(java.sql.Date sqlDateValue) {
        this.sqlDateValue = sqlDateValue;
    }

    public Time getSqlTimeValue() {
        return sqlTimeValue;
    }

    public void setSqlTimeValue(Time sqlTimeValue) {
        this.sqlTimeValue = sqlTimeValue;
    }

    public Timestamp getSqlTimestampValue() {
        return sqlTimestampValue;
    }

    public void setSqlTimestampValue(Timestamp sqlTimestampValue) {
        this.sqlTimestampValue = sqlTimestampValue;
    }

    public LocalDate getLocalDateValue() {
        return localDateValue;
    }

    public void setLocalDateValue(LocalDate localDateValue) {
        this.localDateValue = localDateValue;
    }

    public LocalTime getLocalTimeValue() {
        return localTimeValue;
    }

    public void setLocalTimeValue(LocalTime localTimeValue) {
        this.localTimeValue = localTimeValue;
    }

    public LocalDateTime getLocalDateTimeValue() {
        return localDateTimeValue;
    }

    public void setLocalDateTimeValue(LocalDateTime localDateTimeValue) {
        this.localDateTimeValue = localDateTimeValue;
    }

    public OffsetTime getOffsetTimeValue() {
        return offsetTimeValue;
    }

    public void setOffsetTimeValue(OffsetTime offsetTimeValue) {
        this.offsetTimeValue = offsetTimeValue;
    }

    public OffsetDateTime getOffsetDateTimeValue() {
        return offsetDateTimeValue;
    }

    public void setOffsetDateTimeValue(OffsetDateTime offsetDateTimeValue) {
        this.offsetDateTimeValue = offsetDateTimeValue;
    }

    public Duration getDurationValue() {
        return durationValue;
    }

    public void setDurationValue(Duration durationValue) {
        this.durationValue = durationValue;
    }

    public Instant getInstantValue() {
        return instantValue;
    }

    public void setInstantValue(Instant instantValue) {
        this.instantValue = instantValue;
    }

    public ZonedDateTime getZonedDateTimeValue() {
        return zonedDateTimeValue;
    }

    public void setZonedDateTimeValue(ZonedDateTime zonedDateTimeValue) {
        this.zonedDateTimeValue = zonedDateTimeValue;
    }
}
