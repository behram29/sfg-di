package bahram.springframework.sfgdi.config;

import bahram.springframework.sfgdi.examplebeans.FakeDataSource;
import bahram.springframework.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${bahram.username}")
    String user;
    @Value("${bahram.password}")
    String password;
    @Value("${bahram.dburl}")
    String url;

    @Value("${bahram.jms.username}")
    String jmsUsername;
    @Value("${bahram.jms.password}")
    String jmsPassword;
    @Value("${bahram.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setPassword(jmsPassword);

        return fakeJmsBroker;
    }
}
