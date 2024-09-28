package fr.alasdiablo.mods.ore.tiny.data.lang;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import static fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks.*;

public class LanguagesProvider {
    private static class Global extends LanguageProvider {
        protected Global(PackOutput output, String locale) {
            super(output, TinyOre.MOD_ID, locale);
        }

        @Override
        protected void addTranslations() {
            this.add("item_group." + TinyOre.MOD_ID + ".tab", "Dio's Tiny Ore");
        }
    }

    public static class English {
        private static class Common extends Global {
            protected Common(PackOutput output, String locale) {
                super(output, locale);
            }

            @Override
            protected void addTranslations() {
                super.addTranslations();

                this.add(TINY_COAL_ORE.get(), "Tiny Coal Ore");
                this.add(TINY_COPPER_ORE.get(), "Tiny Copper Ore");
                this.add(TINY_DIAMOND_ORE.get(), "Tiny Diamond Ore");
                this.add(TINY_EMERALD_ORE.get(), "Tiny Emerald Ore");
                this.add(TINY_GOLD_ORE.get(), "Tiny Gold Ore");
                this.add(TINY_IRON_ORE.get(), "Tiny Iron Ore");
                this.add(TINY_LAPIS_ORE.get(), "Tiny Lapis Lazuli Ore");
                this.add(TINY_REDSTONE_ORE.get(), "Tiny Redstone Ore");

                this.add(DEEPSLATE_TINY_COAL_ORE.get(), "Deepslate Tiny Coal Ore");
                this.add(DEEPSLATE_TINY_COPPER_ORE.get(), "Deepslate Tiny Copper Ore");
                this.add(DEEPSLATE_TINY_DIAMOND_ORE.get(), "Deepslate Tiny Diamond Ore");
                this.add(DEEPSLATE_TINY_EMERALD_ORE.get(), "Deepslate Tiny Emerald Ore");
                this.add(DEEPSLATE_TINY_GOLD_ORE.get(), "Deepslate Tiny Gold Ore");
                this.add(DEEPSLATE_TINY_IRON_ORE.get(), "Deepslate Tiny Iron Ore");
                this.add(DEEPSLATE_TINY_LAPIS_ORE.get(), "Deepslate Tiny Lapis Lazuli Ore");
                this.add(DEEPSLATE_TINY_REDSTONE_ORE.get(), "Deepslate Tiny Redstone Ore");
            }
        }

        public static class UnitedKingdom extends Common {
            public UnitedKingdom(PackOutput output) {
                super(output, "en_gb");
            }
        }

        public static class UnitedStates extends Common {
            public UnitedStates(PackOutput output) {
                super(output, "en_us");
            }
        }

        public static class Canada extends Common {
            public Canada(PackOutput output) {
                super(output, "en_ca");
            }
        }

        public static class Australia extends Common {
            public Australia(PackOutput output) {
                super(output, "en_au");
            }
        }

        public static class NewZealand extends Common {
            public NewZealand(PackOutput output) {
                super(output, "en_nz");
            }
        }
    }

    public static class French {
        private static class Common extends Global {
            protected Common(PackOutput output, String locale) {
                super(output, locale);
            }

            @Override
            protected void addTranslations() {
                super.addTranslations();

                this.add(TINY_COAL_ORE.get(), "Minerai de charbon minuscule");
                this.add(TINY_COPPER_ORE.get(), "Minerai de cuivre minuscule");
                this.add(TINY_DIAMOND_ORE.get(), "Minerai de diamant minuscule");
                this.add(TINY_EMERALD_ORE.get(), "Minerai d'émeraude minuscule");
                this.add(TINY_GOLD_ORE.get(), "Minerai d'or minuscule");
                this.add(TINY_IRON_ORE.get(), "Minerai de fer minuscule");
                this.add(TINY_LAPIS_ORE.get(), "Minerai de lapis-lazuli minuscule");
                this.add(TINY_REDSTONE_ORE.get(), "Minerai de redstone minuscule");

                this.add(DEEPSLATE_TINY_COAL_ORE.get(), "Minerai de charbon minuscule des abîmes");
                this.add(DEEPSLATE_TINY_COPPER_ORE.get(), "Minerai de cuivre minuscule des abîmes");
                this.add(DEEPSLATE_TINY_DIAMOND_ORE.get(), "Minerai de diamant minuscule des abîmes");
                this.add(DEEPSLATE_TINY_EMERALD_ORE.get(), "Minerai d'émeraude minuscule des abîmes");
                this.add(DEEPSLATE_TINY_GOLD_ORE.get(), "Minerai d'or minuscule des abîmes");
                this.add(DEEPSLATE_TINY_IRON_ORE.get(), "Minerai de fer minuscule des abîmes");
                this.add(DEEPSLATE_TINY_LAPIS_ORE.get(), "Minerai de lapis-lazuli minuscule des abîmes");
                this.add(DEEPSLATE_TINY_REDSTONE_ORE.get(), "Minerai de redstone minuscule des abîmes");
            }
        }

        public static class France extends Common {
            public France(PackOutput output) {
                super(output, "fr_fr");
            }
        }

        public static class Canada extends Common {
            public Canada(PackOutput output) {
                super(output, "fr_ca");
            }
        }
    }
}

