public class AnalyseText {

    public static void main(String[] args) {
        String texte = "Une phrase est une suite de mots qui, à l'écrit, commence par une majuscule et se termine par une ponctuation forte (point final, point d'exclamation, point d'interrogation, points de suspension). A l'oral, on marque une légère pause entre chaque phrase.";
        
        int nombreDeMots = compterMots(texte);
        System.out.println("Nombre de mots dans le texte : " + nombreDeMots);
    }

    public static int compterMots(String texte) {
        if (texte == null || texte.isEmpty()) {
            return 0;
        }
        
        // Utilisation d'une expression régulière pour découper le texte en mots
        String[] mots = texte.split("\\s+");
        return mots.length;
    }
}
