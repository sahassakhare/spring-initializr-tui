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
                                                text("  Navigation").fg(AppColors.MAVERICK_GREEN).bold(),
                                                row(text("    Tab / Shift-Tab    ").fg(AppColors.WHITE),
                                                                text("Navigate between fields").fg(AppColors.DIM_GRAY)),
                                                row(text("    Arrow Keys         ").fg(AppColors.WHITE),
                                                                text("Change options / Scroll list")
                                                                                .fg(AppColors.DIM_GRAY)),
                                                row(text("    Enter              ").fg(AppColors.WHITE),
                                                                text("Confirm selection").fg(AppColors.DIM_GRAY)),
                                                text(""),
                                                text("  Shortcuts").fg(AppColors.MAVERICK_GREEN).bold(),
                                                row(text("    /                  ").fg(AppColors.WHITE),
                                                                text("Enter dependency search mode")
                                                                                .fg(AppColors.DIM_GRAY)),
                                                row(text("    Space              ").fg(AppColors.WHITE),
                                                                text("Toggle selected dependency")
                                                                                .fg(AppColors.DIM_GRAY)),
                                                row(text("    c                  ").fg(AppColors.WHITE),
                                                                text("Cycle dependency category")
                                                                                .fg(AppColors.DIM_GRAY)),
                                                row(text("    x                  ").fg(AppColors.WHITE),
                                                                text("Clear all selected dependencies")
                                                                                .fg(AppColors.DIM_GRAY)),
                                                row(text("    g                  ").fg(AppColors.WHITE),
                                                                text("Generate project ZIP").fg(AppColors.DIM_GRAY)),
                                                row(text("    e                  ").fg(AppColors.WHITE),
                                                                text("Explore project files before generating")
                                                                                .fg(AppColors.DIM_GRAY)),
                                                row(text("    ?                  ").fg(AppColors.WHITE),
                                                                text("Toggle this help screen").fg(AppColors.DIM_GRAY)),
                                                row(text("    q                  ").fg(AppColors.WHITE),
                                                                text("Quit application").fg(AppColors.DIM_GRAY)),
                                                spacer(),
                                                text("  Press any key to return").fg(AppColors.DIM_GRAY).italic()))
                                .rounded().borderColor(AppColors.MAVERICK_GREEN).id("help-panel");
        }
}
