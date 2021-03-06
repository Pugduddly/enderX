/*
 * Decompiled with CFR 0_123.
 */
package com.mojang.escape.level;

import com.mojang.escape.Game;
import com.mojang.escape.level.Level;
import com.mojang.escape.level.block.Block;

public class StartLevel
extends Level {
    public StartLevel() {
        this.name = "The Prison";
    }

    protected void decorateBlock(int x, int y, Block block, int col) {
        super.decorateBlock(x, y, block, col);
    }

    protected Block getBlock(int x, int y, int col) {
        return super.getBlock(x, y, col);
    }

    public void switchLevel(int id) {
        if (id == 1) {
            this.game.switchLevel("overworld", 1);
        }
        if (id == 2) {
            this.game.switchLevel("dungeon", 1);
        }
    }

    public void getLoot(int id) {
        super.getLoot(id);
    }
}

