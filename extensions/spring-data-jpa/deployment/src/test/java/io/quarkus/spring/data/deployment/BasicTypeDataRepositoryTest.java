package io.quarkus.spring.data.deployment;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
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

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.assertj.core.data.Percentage;
import org.hibernate.Hibernate;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkus.test.QuarkusUnitTest;

public class BasicTypeDataRepositoryTest {

    @RegisterExtension
    static final QuarkusUnitTest config = new QuarkusUnitTest().setArchiveProducer(
            () -> ShrinkWrap.create(JavaArchive.class)
                    .addClasses(BasicTypeData.class, BasicTypeDataRepository.class))
            .withConfigurationResource("application.properties");

    @Inject
    BasicTypeDataRepository repo;

    @Test
    @Transactional
    public void testInsert() throws Exception {
        BasicTypeData item = populateData(new BasicTypeData());
        repo.save(item);
    }

    @Test
    @Transactional
    public void testFind() throws Exception {
        DOES NOT WORK YET
        Double price = repo.findPriceOfProduct(new URL("https://quarkus.io/guides/spring-data-jpa"));
        assertThat(price).isCloseTo(Math.PI, Percentage.withPercentage(1));
    }

    private BasicTypeData populateData(BasicTypeData basicTypeData) throws MalformedURLException, SQLException {
        basicTypeData.setLongValue(Long.valueOf(9L));
        basicTypeData.setIntegerValue(Integer.valueOf(11));
        basicTypeData.setShortValue(Short.valueOf((short) 12));
        basicTypeData.setCharacterValue(Character.valueOf('a'));
        basicTypeData.setByteValue(Byte.valueOf((byte) 13));
        basicTypeData.setDoubleValue(Double.valueOf(Math.PI));
        basicTypeData.setFloatValue(Float.valueOf((float) Math.E));
        basicTypeData.setBooleanValue(Boolean.valueOf(true));
        basicTypeData.setBigIntegerValue(BigInteger.TEN);
        basicTypeData.setBigDecimalValue(BigDecimal.valueOf(Math.PI * 2.0));
        basicTypeData.setStringValue(new String());
        basicTypeData.setLocaleValue(Locale.TRADITIONAL_CHINESE);
        basicTypeData.setTimeZoneValue(TimeZone.getTimeZone("PDT"));
        basicTypeData.setUrlValue(new URL("https://quarkus.io/guides/spring-data-jpa"));
        basicTypeData.setClassValue(Hibernate.class);
        basicTypeData.setUuidValue(UUID.randomUUID());
        /*
         * basicTypeData.setClobValue(new SerialClob(("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod "
         * + "tempor incididunt ut labore et dolore magna aliqua.").toCharArray()));
         */
        basicTypeData.setUtilDateValue(new Date());
        basicTypeData.setCalendarValue(Calendar.getInstance());
        basicTypeData.setSqlDateValue(new java.sql.Date(System.currentTimeMillis()));
        basicTypeData.setSqlTimeValue(java.sql.Time.valueOf("23:51:45"));
        basicTypeData.setSqlTimestampValue(new java.sql.Timestamp(System.currentTimeMillis()));
        basicTypeData.setLocalDateValue(LocalDate.now());
        basicTypeData.setLocalTimeValue(LocalTime.now());
        basicTypeData.setLocalDateTimeValue(LocalDateTime.now());
        basicTypeData.setOffsetTimeValue(OffsetTime.now());
        basicTypeData.setOffsetDateTimeValue(OffsetDateTime.now());
        basicTypeData.setDurationValue(Duration.ofMillis(System.currentTimeMillis()));
        basicTypeData.setInstantValue(Instant.now());
        basicTypeData.setZonedDateTimeValue(ZonedDateTime.now());

        return basicTypeData;
    }
}
