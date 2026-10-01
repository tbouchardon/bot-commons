package fr.ksuto.bot;

import com.google.inject.Inject;
import com.google.inject.Injector;
import fr.ksuto.logger.LoggerInjectors;
import fr.ksuto.prh.PeripheralRobotHelper;
import lombok.Data;

@Data
public abstract class AbstractBot {

    @Inject
    private PeripheralRobotHelper robotHelper;

    public static void main(String[] args) {

        Injector injector = LoggerInjectors.getLoggerInjector();
        AbstractBot wrapper = injector.getInstance(AbstractBot.class);

        wrapper.run();
    }

    public abstract void run();

}
