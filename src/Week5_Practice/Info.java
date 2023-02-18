package Week5_Practice;

import java.util.stream.IntStream;

public class Info {

    private int generation;
    private int htmlScore;
    private int cssScore;
    private int jsScore;

    public Info(int generation, int htmlScore, int cssScore, int jsScore) {
        this.generation = generation;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.jsScore = jsScore;
    }

    public int getHighestScore() {
        int target = Math.max(this.htmlScore, this.cssScore);
        return Math.max(target, this.jsScore);
    }

    public int getLowestScore() {
        int target = Math.min(this.htmlScore, this.cssScore);
        return Math.min(target, this.jsScore);
    }

    public double getAverageScore() {
        return (IntStream.of(this.getHtmlScore(), this.getCssScore(),
            this.getJsScore()).average()).orElseThrow(IllegalAccessError::new);
    }

    public Info() {

    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getHtmlScore() {
        return htmlScore;
    }

    public void setHtmlScore(int htmlScore) {
        this.htmlScore = htmlScore;
    }

    public int getCssScore() {
        return cssScore;
    }

    public void setCssScore(int cssScore) {
        this.cssScore = cssScore;
    }

    public int getJsScore() {
        return jsScore;
    }

    public void setJsScore(int jsScore) {
        this.jsScore = jsScore;
    }


}
