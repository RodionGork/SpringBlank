package none.rg.springblank;

import java.sql.SQLException;
import org.h2.tools.Server;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements ApplicationListener {
    
    private Server tcpServer, webServer;
    
    public void onApplicationEvent(ApplicationEvent e) {
        if (e instanceof ContextRefreshedEvent) {
            startDatabase();
        } else if (e instanceof ContextClosedEvent) {
            stopDatabase();
        }
    }
    
    private void startDatabase() {
        try {
            String[] tcpOptions = new String[] {
                "-tcpPort", "12345", "-tcpAllowOthers"};
            String[] webOptions = new String[] {
                "-webAllowOthers"};
            tcpServer = Server.createTcpServer(tcpOptions).start();
            webServer = Server.createWebServer(webOptions).start();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    private void stopDatabase() {
        tcpServer.stop();
        webServer.stop();
    }
}
