package design_pattern.creational.builder;

public class Rect {
    private final int width;
    private final int height;
    private final int margin;
    private final int padding;

    public static class Builder {
        private final int width;
        private final int height;
        private int margin;
        private int padding;

        public Builder(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public Builder margin(int margin) {
            this.margin = margin;
            return this;
        }

        public Builder padding(int padding) {
            this.padding = padding;
            return this;
        }

        public Rect build() {
            return new Rect(this);
        }
    }

    private Rect(Builder builder) {
        width = builder.width;
        height = builder.height;
        margin = builder.margin;
        padding = builder.padding;
    }
}
