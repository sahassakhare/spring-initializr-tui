package org.maverick.devtools.util;

import dev.tamboui.style.Color;

/**
 * Centralized color constants for the Maverick DevTools application.
 * Uses role-based naming to ensure theme stability and professional aesthetic.
 */
public final class AppColors {

    private AppColors() {
    }

    // Professional Enterprise Palette (Custom Hex-based)
    // Background: #0A1A3C, Surface: #143A75, Text: #BFD8FF, Success: #9ADBC6,
    // Warning: #FFD66B
    public static final Color BRAND_PRIMARY = Color.rgb(20, 58, 117); // Surface #143A75
    public static final Color BRAND_SECONDARY = Color.rgb(191, 216, 255); // Text #BFD8FF (as secondary/labels)
    public static final Color BRAND_DIM = Color.rgb(10, 26, 60); // Background #0A1A3C
    public static final Color BRAND_SUCCESS = Color.rgb(154, 219, 198); // Soft Mint #9ADBC6
    public static final Color BRAND_HIGHLIGHT = Color.rgb(255, 214, 107); // Ion Gold #FFD66B
    public static final Color BRAND_GOLD = Color.rgb(255, 214, 107); // Ion Gold #FFD66B

    // Utility colors
    public static final Color WHITE = Color.rgb(191, 216, 255); // Soft blue-tinted white #BFD8FF
    public static final Color YELLOW = Color.rgb(255, 214, 107); // #FFD66B
    public static final Color RED = Color.RED; // Keeping standard red for errors
    public static final Color CYAN = Color.rgb(191, 216, 255); // Map to Text color
    public static final Color DIM_GRAY = Color.rgb(20, 58, 117); // Map to Surface color

    public static final Color COMMENT_GRAY = Color.rgb(75, 85, 99); // Graphite-like for comments
}
