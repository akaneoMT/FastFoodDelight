# FastFood Delight

<img src="src/main/resources/logo.png" width="128" alt="FastFood Delight logo">

## A lightweight fast food expansion for [Farmer's Delight](https://github.com/MehVahdJukaar/FarmersDelightRefabricated)!

### Overview

**FastFood Delight** is an addon for Farmer's Delight that brings the taste of fast food to your Minecraft world.

Fry up **fries** from potatoes, carrots, onions and beets, stack **burgers and sandwiches** with your own homemade cheese, cool down with **sodas** and **ice creams**, and grab a bite at the **fast food shops** that now pop up in villages, run by the brand new **Fast Food Waiter**!

### Features

- **Fries**: French fries, carrot fries, fried onions and beet fries, cooked in the Cooking Pot and served in a Fries Bowl
- **Sandwiches & wraps**: cheeseburger, croque monsieur, cod, salmon, pork, rabbit and chicken cheese sandwiches, cheese and chicken wraps, chicken nuggets
- **Drinks**: cola, orange, lemon and creaming sodas, iced tea
- **Desserts**: plain, chocolate, sweet berry and fruit ice creams, apple sauce
- **Cheese**, made from milk in the Cooking Pot
- **Checkout Machine**: the job site of the **Fast Food Waiter**, a new villager profession that sells fast food for gold nuggets
- **Fast food shops** in plains, desert, savanna, snowy and taiga villages

### Requirements

| Mod | Version |
|---|---|
| Minecraft | 26.1, 26.2 or 26.3 |
| [Fabric Loader](https://fabricmc.net/) | 0.19.5 or newer |
| [Fabric API](https://modrinth.com/mod/fabric-api) | matching your Minecraft version |
| [Farmer's Delight Refabricated](https://modrinth.com/mod/farmers-delight-refabricated) | matching your Minecraft version |

### Configuration

A config file is created at `config/fastfooddelight-common.json`:

- `generateVillageFastFoods`: enable or disable fast food shops in villages
- `villageFastFoodWeight` (0 to 50, default 15): how often fast food shops appear among village houses

Changes apply the next time a world is loaded.

### Datapacks

The Fast Food Waiter's trades are fully data-driven and can be changed with a datapack:

- `data/fastfooddelight/villager_trade/fast_food_waiter/`: one file per trade
- `data/fastfooddelight/tags/villager_trade/fast_food_waiter/`: the trades available at each level
- `data/fastfooddelight/trade_set/fast_food_waiter/`: how many trades are offered at each level

### Branches

| Branch | Minecraft | Loader |
|---|---|---|
| `fabric-26.3` | 26.3 | Fabric |
| `fabric-26.2` | 26.2 | Fabric |
| `fabric-26.1` | 26.1 | Fabric |
| `master` | 1.19 | Forge (original version, no longer updated) |

### Building from source

The mod requires **Java 25**.

```bash
./gradlew build
```

The mod jar is created in `build/libs/`.

### About this update

The **2.0.0 update** (port from Forge 1.19 to Fabric 26.x) was made **with the help of AI** ([Claude](https://claude.com/claude-code), by Anthropic), under the direction of the original author, who guided every step and reviewed the changes. Textures, items and the original design of the mod remain the author's own work.

### Contributing

If you find a bug or a translation mistake, feel free to open an issue! Most translations were generated for this update, so corrections from native speakers are very welcome.

### Credits

- **Akaneo**: original author
- **vectorwing**: creator of [Farmer's Delight](https://github.com/vectorwing/FarmersDelight)
- **MehVahdJukaar, ChrysanthCow and cassiancc**: [Farmer's Delight Refabricated](https://github.com/MehVahdJukaar/FarmersDelightRefabricated), whose code structure this port follows
- **Rinko1231**: [unofficial 1.20/1.21 update](https://github.com/Rinko1231/FastFoodDelightUnofficial), which inspired several changes in 2.0.0

### License

FastFood Delight is licensed under the [MIT License](https://github.com/akaneoMT/FastFoodDelight/blob/fabric-26.3/LICENSE).
