package org.maverick.devtools.util;

import dev.tamboui.style.Color;

/**
 * Centralized color constants for the Maverick DevTools application.
 * Uses role-based naming to ensure theme stability and professional aesthetic.
 */
public final class AppColors {

    private AppColors() {
    }

    // Modern Enterprise Palette (Indigo & Graphite)
    public static final Color BRAND_PRIMARY = Color.rgb(129, 140, 248); // Indigo 400
    public static final Color BRAND_SECONDARY = Color.rgb(156, 163, 175); // Graphite 400
    public static final Color BRAND_DIM = Color.rgb(75, 85, 99); // Graphite 600
    public static final Color BRAND_SUCCESS = Color.rgb(20, 184, 166); // Professional Teal 500
    public static final Color BRAND_HIGHLIGHT = Color.rgb(96, 165, 250); // Sky Blue 400
    public static final Color BRAND_GOLD = Color.rgb(251, 191, 36); // Amber 400

    // Utility colors
    public static final Color WHITE = Color.WHITE;
    public static final Color YELLOW = Color.YELLOW;
    public static final Color RED = Color.RED;
    public static final Color CYAN = Color.CYAN;
    public static final Color DIM_GRAY = Color.DARK_GRAY;

    public static final Color COMMENT_GRAY = Color.rgb(100, 100, 100);
}
