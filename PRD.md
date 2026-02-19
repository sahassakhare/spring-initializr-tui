Quick Wins

~~1. Favorite/recent dependencies — Show recently used dependency combos at the top of the picker (you already persist them in ConfigStore, just not surfacing them in the UI)~~
~~2. Category filtering — Let users press a key (e.g., c) to cycle through dependency categories ("Web", "Data", "Security", etc.) instead of scrolling through everything~~
~~3. Fuzzy search — Current search is substring-only. Fuzzy matching would let users type sweb and find "Spring Web"~~
4. Reset form to defaults — A single key to reset all config fields back to API defaults (complement to the new "clear deps" feature)

Medium Effort

5. Dependency details panel — When hovering over a dependency, show its description, required Boot version range, and related dependencies in a side panel
6. Bookmarked project templates — Save entire project configs (not just deps) as named templates like "microservice", "web-app", "batch-job" for quick reuse
7. Linux IDE support — IdeLauncher currently only covers macOS and Windows
8. Starter presets — One-key combos like "Web + Security + JPA + Actuator" for common stacks

Bigger Features

9. Diff/compare mode — Toggle a dependency on/off in Explore and see the build file diff inline
10. Dependency conflict warnings — Flag known incompatibilities (e.g., selecting both Spring MVC and Spring WebFlux)
11. Multi-module project support — Generate projects with multiple modules from a single session
12. Project history — Track previously generated projects with the ability to re-generate or open them