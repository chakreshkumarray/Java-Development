package Set.EnumSet;

import java.util.EnumSet;

public class StyleEnumSet {
public static void main(String[] args) {

// 1. Create an empty set for the Style enum
    EnumSet<Style> styles = EnumSet.noneOf(Style.class);

// 2. Create a set containing all constants
    EnumSet<Style> allStyles = EnumSet.allOf(Style.class);

// 3. Create a set with specific elements
    EnumSet<Style> titleStyle = EnumSet.of(Style.BOLD, Style.ITALIC);

// 4. Create a range of elements (inclusive)
// Adds BOLD, ITALIC, and UNDERLINE
    EnumSet<Style> range = EnumSet.range(Style.BOLD, Style.UNDERLINE);

    // Adding elements
    styles.add(Style.BOLD);

// Removing elements
    styles.remove(Style.ITALIC);

// Complement (All elements EXCEPT the ones currently in the set)
// If 'styles' contains BOLD, 'others' will contain ITALIC, UNDERLINE, STRIKETHROUGH
    EnumSet<Style> others = EnumSet.complementOf(styles);


    }
}
