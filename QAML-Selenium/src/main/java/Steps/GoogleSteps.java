package Steps;

import org.openqa.selenium.WebDriver;

public class GoogleSteps extends BaseSteps{

    public GoogleSteps(WebDriver driver) {
        super(driver);
    }

    public void abrirPaginaGoogle(){
        webDriver.get("https://www.google.com/");//abro la pagina
    }

    public void navegarPaginaFacebok(){
        webDriver.navigate().to("https://www.facebook.com/");
    }

    public void navegarPaginaESPN(){
        webDriver.navigate().to("https://www.espn.com.mx/");
    }
}
