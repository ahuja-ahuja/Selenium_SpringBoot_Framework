package selenium.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverConfig {

    @Value("${selenium.browser::chrome}")
    private String browser;

    @Value("${selenium.url}")
    private String url;

    @Bean
    public WebDriver getWebdriver(){
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }
}
