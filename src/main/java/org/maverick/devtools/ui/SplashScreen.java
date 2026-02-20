package org.maverick.devtools.ui;

import org.maverick.devtools.util.AppColors;
import dev.tamboui.style.Color;
import dev.tamboui.toolkit.element.Element;

import java.util.Arrays;

import static dev.tamboui.toolkit.Toolkit.*;

/**
 * Splash screen showing the Maverick banner and loading progress.
 */
public class SplashScreen {

    private static final String[] BANNER_LINES = {
            "   __  __                       _      _    ",
            "  |  \\/  | __ ___   _____ _ __(_) ___| | __",
            "  | |\\/| |/ _` \\ \\ / / _ \\ '__| |/ __| |/ /",
            "  | |  | | (_| |\\ V /  __/ |  | | (__|   < ",
            "  |_|  |_|\\__,_| \\_/ \\___|_|  |_|\\___|_|\\_\\",
            "  ========================================="
    };

    private final double progress;
    private final String statusMessage;

    public SplashScreen(double progress, String statusMessage) {
        this.progress = progress;
        this.statusMessage = statusMessage;
    }

    private static String buildSubtitle() {
        String version = SplashScreen.class.getPackage().getImplementationVersion();
        if (version == null)
            version = "dev";
        String jdk = "JDK " + Runtime.version().feature();
        return " :: Maverick DevTools ::          (v" + version + " | " + jdk + ")";
    }

    public Element render() {
        Element[] bannerElements = Arrays.stream(BANNER_LINES)
                .map(line -> text(line).fg(AppColors.MAVERICK_TEAL).bold().length(1))
                .toArray(Element[]::new);

        return column(
                spacer(),
                column(bannerElements),
                text(buildSubtitle()).fg(AppColors.DIM_TEAL).length(1),
                spacer(),
                gauge(progress).fg(AppColors.MAVERICK_TEAL).label(statusMessage),
                spacer()).id("splash");
    }
}
