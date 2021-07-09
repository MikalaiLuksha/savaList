package by.pelar.config;

        import by.pelar.entity.User;
        import org.springframework.boot.jdbc.DataSourceBuilder;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.jdbc.core.JdbcTemplate;
        import org.springframework.web.servlet.config.annotation.EnableWebMvc;
        import org.springframework.web.servlet.view.InternalResourceViewResolver;

        import javax.sql.DataSource;
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
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/savalist");
        dataSourceBuilder.username("postgresql");
        dataSourceBuilder.password("1987Roll");
        return dataSourceBuilder.build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

}
