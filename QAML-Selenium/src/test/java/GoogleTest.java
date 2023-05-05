import Steps.GoogleSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
    private WebDriver webDriver = getWebDriver();
    private GoogleSteps googleSteps = new GoogleSteps(webDriver);

    @Test
    public void openGoogleTest(){
        googleSteps.abrirPaginaGoogle();
        String urlActual=googleSteps.getUrlActual();
        System.out.println("La URL actual es: "+urlActual);
        Assert.assertEquals(urlActual,"https://www.google.com/");
        googleSteps.cerrarVentana();
    }

    @Test
    public void ejercicio2(){
        googleSteps.abrirPaginaGoogle();

        String titulo=googleSteps.getTituloActual();
        googleSteps.imprimir("El titulo actual es: "+titulo);
        Assert.assertEquals(titulo,"Google");

        String urlActual=googleSteps.getUrlActual();
        googleSteps.imprimir("La URL actual es: "+urlActual);
        Assert.assertEquals(urlActual,"https://www.google.com/");

        String codigoFuente=googleSteps.getCodigoFuente();
        googleSteps.imprimir("El codigo fuente actual es: "+codigoFuente);

        googleSteps.cerrarVentana();
    }

    @Test
    public void metodoNavigateTest(){
        googleSteps.abrirPaginaGoogle();
        String urlActual = googleSteps.getUrlActual();
        String urlExpected = "https://www.google.com/";
        googleSteps.imprimir(urlActual);
        Assert.assertEquals(urlActual,urlExpected);

        googleSteps.navegarPaginaFacebok();
        String tituloActualFacebook = googleSteps.getTituloActual();
        String tituloExpectedFacebook = "Facebook - Inicia sesión o regístrate";
        googleSteps.imprimir(tituloActualFacebook);
        Assert.assertEquals(tituloActualFacebook,tituloExpectedFacebook);

        googleSteps.navegarPaginaESPN();
        String urlESPN=googleSteps.getUrlActual();
        String urlEsperada="https://www.espn.com.mx/";
        googleSteps.imprimir(urlESPN);
        Assert.assertEquals(urlESPN, urlEsperada);

        webDriver.navigate().back();
        webDriver.navigate().back();
        String nuevaUrlActual = googleSteps.getUrlActual();
        googleSteps.imprimir(nuevaUrlActual);
        Assert.assertEquals(nuevaUrlActual,urlExpected);

        webDriver.navigate().forward();
        String nuevaUrlActual2 = googleSteps.getUrlActual();
        String nuevaUrlExpected2 = "https://www.facebook.com/";
        googleSteps.imprimir(nuevaUrlActual2);
        Assert.assertEquals(nuevaUrlActual2,nuevaUrlExpected2);

        webDriver.navigate().refresh();
        googleSteps.imprimir(googleSteps.getUrlActual());
        Assert.assertEquals(nuevaUrlExpected2,googleSteps.getUrlActual());

        googleSteps.finalizarWebDriver();
    }
}
