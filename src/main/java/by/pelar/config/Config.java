package by.pelar.config;

        import by.pelar.entity.User;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.jdbc.datasource.DriverManagerDataSource;
        import org.springframework.web.servlet.config.annotation.EnableWebMvc;
        import org.springframework.web.servlet.view.InternalResourceViewResolver;

        import java.util.ArrayList;
        import java.util.List;

@Configuration
@ComponentScan(basePackages = "by.pelar")
@EnableWebMvc
public class Config {

    @Bean
    public InternalResourceViewResolver inter(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/pages/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;

    }

    @Bean
    public List<User> userList (){
        return new ArrayList<>();
    }


    @Bean
    public DriverManagerDataSource getDataSource() {

        DriverManagerDataSource bds = new DriverManagerDataSource();
        bds.setDriverClassName("org.postgresql.Drive");
        bds.setUrl("jdbc:mysql://localhost:5432/dbname");
        bds.setUsername("user");
        bds.setPassword("pass");

        return bds;
    }

}
