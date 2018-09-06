package com.devosha.materialpreference;

import android.graphics.Color;
import java.util.HashSet;
import java.util.Set;

/**
 * Our Form class. Our Form data object class.
 * MAIN ROLE : Get and set Form values.
 */
public class Form {
    /**
     * Our instance fields
     */
    private int yearsOfExp;
    private int favoriteColor;
    private boolean isAdequate;
    private Set<String> technologies;

    /**
     * Our Form constructor.
     * Initialize and set Form values.
     */
    public Form() {
        technologies = new HashSet<>();
        favoriteColor = Color.CYAN;
        yearsOfExp = 5;
    }

    /**
     * Our Getter and Setter methods.
     *
     */
    public int getYearsOfExperience() { return yearsOfExp; }
    public void setYearsOfExp(int yearsOfExp) { this.yearsOfExp = yearsOfExp;}
    public int getFavoriteColor() { return favoriteColor; }
    public void setFavoriteColor(int favoriteColor) { this.favoriteColor = favoriteColor; }
    public boolean isAdequate() {return isAdequate; }
    public void setIsAdequate(boolean isAdequate) { this.isAdequate = isAdequate; }
    public Set<String> getTechnologies() { return technologies; }
    public void setTechnologies(Set<String> technologies) { this.technologies = technologies; }

    /**
     * Our toString() method. We are overriding this method.
     * @return string representation of this `Form` class.
     */
    @Override
    public String toString() {
        return "Form{" +
                "yearsOfExp=" + yearsOfExp +
                ", favoriteColor=" + favoriteColor +
                ", isAdequate=" + isAdequate +
                ", technologies=" + technologies +
                '}';
    }
    //end
}
