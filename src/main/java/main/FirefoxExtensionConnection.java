//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.function.BiConsumer;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ExtensionConnection;
//
//public class FirefoxExtensionConnection {
//  private final String portName;
//  private ExtensionConnection connection;
//  private List<BiConsumer<ExtensionConnection, Map<String, Object>>> messageListeners = new ArrayList<>();
//
//  public FirefoxExtensionConnection(String portName, WebDriver driver) {
//    this.portName = portName;
//    FirefoxProfile profile = ((FirefoxDriver) driver).getProfile();
//    this.connection = profile.getWebExtensionConnection(portName);
//  }
//
//  public void addMessageListener(BiConsumer<ExtensionConnection, Map<String, Object>> listener) {
//    messageListeners.add(listener);
//    connection.addMessageListener(new ExtensionConnection.MessageListener() {
//      @Override
//      public void onMessage(Map<String, Object> message) {
//        listener.accept(connection, message);
//      }
//    });
//  }
//}
