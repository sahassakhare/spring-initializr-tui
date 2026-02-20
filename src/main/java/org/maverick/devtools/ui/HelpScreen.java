package org.maverick.devtools.ui;

import org.maverick.devtools.util.AppColors;
import dev.tamboui.toolkit.element.Element;

import static dev.tamboui.toolkit.Toolkit.*;

/**
 * Full-screen help overlay showing keyboard shortcuts for all screens.
 */
public class HelpScreen {

        public Element render() {
                return panel("Maverick DevTools Help",
                                column(
                                                text("  Navigation").fg(AppColors.BRAND_PRIMARY).bold(),
                                                row(text("    Tab / Shift-Tab    ").fg(AppColors.WHITE),
                                                                text("Navigate between fields").fg(AppColors.BRAND_SECONDARY)),
                                                row(text("    Arrow Keys         ").fg(AppColors.WHITE),
                                                                text("Change options / Scroll list")
                                                                                .fg(AppColors.BRAND_SECONDARY)),
                                                row(text("    Enter              ").fg(AppColors.WHITE),
                                                                text("Confirm selection").fg(AppColors.BRAND_SECONDARY)),
                                                text(""),
                                                text("  Shortcuts").fg(AppColors.BRAND_PRIMARY).bold(),
                                                row(text("    /                  ").fg(AppColors.WHITE),
                                                                text("Enter dependency search mode")
                                                                                .fg(AppColors.BRAND_SECONDARY)),
                                                row(text("    Space              ").fg(AppColors.WHITE),
                                                                text("Toggle selected dependency")
                                                                                .fg(AppColors.BRAND_SECONDARY)),
                                                row(text("    c                  ").fg(AppColors.WHITE),
                                                                text("Cycle dependency category")
                                                                                .fg(AppColors.BRAND_SECONDARY)),
                                                row(text("    x                  ").fg(AppColors.WHITE),
                                                                text("Clear all selected dependencies")
                                                                                .fg(AppColors.BRAND_SECONDARY)),
                                                row(text("    g                  ").fg(AppColors.WHITE),
                                                                text("Generate project ZIP").fg(AppColors.BRAND_SECONDARY)),
                                                row(text("    e                  ").fg(AppColors.WHITE),
                                                                text("Explore project files before generating")
                                                                                .fg(AppColors.BRAND_SECONDARY)),
                                                row(text("    ?                  ").fg(AppColors.WHITE),
                                                                text("Toggle this help screen").fg(AppColors.BRAND_SECONDARY)),
                                                row(text("    q                  ").fg(AppColors.WHITE),
                                                                text("Quit application").fg(AppColors.BRAND_SECONDARY)),
                                                spacer(),
                                                text("  Press any key to return").fg(AppColors.BRAND_SECONDARY).italic()))
                                .rounded().borderColor(AppColors.BRAND_PRIMARY).id("help-panel");
        }
}
