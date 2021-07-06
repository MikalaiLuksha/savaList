package by.pelar.config;

        import by.pelar.entity.User;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
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

}
