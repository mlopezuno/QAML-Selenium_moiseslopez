package Steps;

import org.openqa.selenium.WebDriver;

public class BaseSteps {
    public WebDriver webDriver;

    //Constructor
    public BaseSteps(WebDriver driver){
        this.webDriver = driver;
    }

    public String getUrlActual(){
        return webDriver.getCurrentUrl();
    }

    public String getTituloActual(){
        return webDriver.getTitle();
    }

    public void cerrarVentana(){
        webDriver.close();
    }

    public String getCodigoFuente(){
        return webDriver.getPageSource();
    }

    public void finalizarWebDriver(){
        webDriver.quit();
    }

    public void imprimir(String cadenaAImprimir){
        System.out.println(cadenaAImprimir);
    }
}
