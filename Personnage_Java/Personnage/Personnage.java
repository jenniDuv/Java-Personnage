package Personnage;
public class Personnage {
        // le constructeur
        public Personnage(String name,int life) {
                        this.nom = name;
                        this.vie = life;
        }

        // Accesseur du nom du personnage
        public String LeNom() {
                return this.nom;
        }

        // Accesseur ou Getter sur le nombre de points de vie de l'objet
        public int      LaVie() {
                return this.vie;
        }

        // M&#9500;®thode AugmenterVie(int valeur)
        public void AugmenterVie(int valeur) {
                this.vie = this.vie + valeur;
        }

        // M&#9500;®thode attaque
        public void Attaque(Personnage perso , int force ) {
                perso.vie = perso.vie - force/2;
                this.vie = this.vie - force/2;
        }

        // Les attributs :
        private String nom;
        private int vie;
}