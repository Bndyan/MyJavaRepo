package konsole;

/**
 *   Die Klasse Bewohner der pascalinischen Süempfe
 *   In den pascalinischen Sümpfen leben die vier Stämme der Asis, Belas, Cedis
 *   und Drudis. Forschungen haben ergeben, daß es vier Eigenschaften gibt, die
 *   eine Unterscheidung der Stämme erlauben: ein Bewohner der Sümpfe kann (muß
 *   aber nicht) manuseln, einen Knelt haben, löpsen und nopeln. Man weiß, daß nur
 *   die Asis einen Knelt haben und manuseln. Hat jemand keinen Knelt und nopelt,
 *   dann ist er gewiß ein Bela. Ein Bewohner mit Knelt, der nicht manuselt, ist
 *   ein Cedi, wenn er immer nopelt. Wer keinen Knelt hat und löpst, nie nopelt
 *   und stets manuselt, ist mit Bestimmtheit ein Cedi; würde er nicht manuseln,
 *   wäre er ein Drudi. Es ist geradezu typisch für Drudis, daß sie weder manuseln
 *   noch nopeln, aber einen ordentlichen Knelt haben. Ganz enthaltsame Bewohner,
 *   die keinen Knelt haben, nicht löpsen und nicht nopeln, sind Drudis, wenn sie
 *   manuseln, und Cedis, wenn sie nicht manuseln.
 *
 *   Ein Programm soll nun auf Basis der vier Eigenschaften eines Sumpfbewohners
 *   eine Diagnose liefern, zu welchem Stamm dieser gehört. Eine
 *   geschachtelte bedingte Anweisung, die genau der vorgegebenen Beschreibung
 *   folgt, löst das Problem.
 * @author k.bndyan
 * @version 1.0
 * @date 14.08.2024
 */
public class BewohnerPascalinischenSuempfe {
    public static void main(String[] args) {
        boolean knelt, manuseln, loepsen, nopeln;
        String stamm = "";

        knelt = true;
        manuseln = false;
        nopeln = false;
        loepsen = false;

        if (knelt)
            if (manuseln)
                stamm = "ASIS";
            else
            if (nopeln)
                stamm = "DRUDI";
            else
                stamm = "CEDI";
        else
        if (nopeln)
            stamm = "BELA";
        else
        if (loepsen)
            if (manuseln)
                stamm = "CEDI";
            else
                stamm = "DRUDI";
        else
        if (manuseln)
            stamm = "DRUDI";
        else
            stamm = "CEDI";

        System.out.println("Bei diesen Eigenschaften handelt es sich um einen "
                + stamm);

    }
}
