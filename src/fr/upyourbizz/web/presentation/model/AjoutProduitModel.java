/**
 * © 2013, Upyourbizz - All right reserved
 */
package fr.upyourbizz.web.presentation.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AjoutProduitModel
 */
public class AjoutProduitModel {

    // ===== Attributs statiques ==============================================

    @SuppressWarnings("unused")
    private final Logger logger = LoggerFactory.getLogger(AjoutProduitModel.class);

    // ===== Méthodes statiques ===============================================

    /*
     * Produit
     */

    private String nom = "";

    private String reference = "";

    private List<SelectItem> listeFamilles = new ArrayList<SelectItem>();

    private String familleSelectionnee = "";

    private List<SelectItem> listeSousFamilles = new ArrayList<SelectItem>();;

    private String sousFamilleSelectionnee = "";

    /*
     * Description
     */

    private String descriptionCourte = "";

    private String descriptionOffre = "";

    private String avantages = "";

    private String benefices = "";

    /*
     * Prix
     */

    private float coutNominal = 0F;

    private float prixUnitaireFixe = 0F;

    private int borneInferieure;

    private int borneSuperieure;

    private float coutUnitaire = 0F;

    private List<PrixDegressif> listePrixDegressifProduit = new ArrayList<PrixDegressif>();

    /*
     * Options
     */

    private List<Option> listeOptions = new ArrayList<Option>();

    private boolean afficherPartieNouvelleOption = false;

    private String optionNom = "";

    private String optionReference = "";

    private List<PrixDegressif> listeOptionPrixDegressifProduit = new ArrayList<PrixDegressif>();

    private Option optionSelectionne;

    private float optionCoutNominal = 0F;

    private boolean optionObligatoire = false;

    private float optionCoutUnitaireFixe = 0F;

    private int optionBorneInferieure;

    private int optionBorneSuperieure;

    private float optionCoutUnitaire = 0F;

    /**
     * Permet l'annulation de la modification
     */
    private Option optionAvantModification = null;

    // ===== Attributs ========================================================

    // ===== Constructeurs ====================================================

    public AjoutProduitModel() {
        listeFamilles.add(new SelectItem("Marketing"));
    }

    // ===== Méthodes =========================================================

    /**
     * Réinitialise les champs de la partie ajout option produit
     */
    public void reinitialiserAjoutOption() {
        optionNom = "";
        optionReference = "";
        optionObligatoire = false;
        optionCoutNominal = 0F;
        optionCoutUnitaire = 0F;
        optionCoutUnitaireFixe = 0F;
        optionBorneInferieure = 0;
        optionBorneSuperieure = 0;
        listeOptionPrixDegressifProduit = new ArrayList<PrixDegressif>();
    }

    // ===== Accesseurs =======================================================

    /**
     * Retourne nom
     * 
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Affecte nom
     * 
     * @param nom nom à affecter
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne reference
     * 
     * @return reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * Affecte reference
     * 
     * @param reference reference à affecter
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Retourne listeFamilles
     * 
     * @return listeFamilles
     */
    public List<SelectItem> getListeFamilles() {
        return listeFamilles;
    }

    /**
     * Affecte listeFamilles
     * 
     * @param listeFamilles listeFamilles à affecter
     */
    public void setListeFamilles(List<SelectItem> listeFamilles) {
        this.listeFamilles = listeFamilles;
    }

    /**
     * Retourne familleSelectionnee
     * 
     * @return familleSelectionnee
     */
    public String getFamilleSelectionnee() {
        return familleSelectionnee;
    }

    /**
     * Affecte familleSelectionnee
     * 
     * @param familleSelectionnee familleSelectionnee à affecter
     */
    public void setFamilleSelectionnee(String familleSelectionnee) {
        this.familleSelectionnee = familleSelectionnee;
    }

    /**
     * Retourne listeSousFamilles
     * 
     * @return listeSousFamilles
     */
    public List<SelectItem> getListeSousFamilles() {
        return listeSousFamilles;
    }

    /**
     * Affecte listeSousFamilles
     * 
     * @param listeSousFamilles listeSousFamilles à affecter
     */
    public void setListeSousFamilles(List<SelectItem> listeSousFamilles) {
        this.listeSousFamilles = listeSousFamilles;
    }

    /**
     * Retourne sousFamilleSelectionnee
     * 
     * @return sousFamilleSelectionnee
     */
    public String getSousFamilleSelectionnee() {
        return sousFamilleSelectionnee;
    }

    /**
     * Affecte sousFamilleSelectionnee
     * 
     * @param sousFamilleSelectionnee sousFamilleSelectionnee à affecter
     */
    public void setSousFamilleSelectionnee(String sousFamilleSelectionnee) {
        this.sousFamilleSelectionnee = sousFamilleSelectionnee;
    }

    /**
     * Retourne descriptionCourte
     * 
     * @return descriptionCourte
     */
    public String getDescriptionCourte() {
        return descriptionCourte;
    }

    /**
     * Affecte descriptionCourte
     * 
     * @param descriptionCourte descriptionCourte à affecter
     */
    public void setDescriptionCourte(String descriptionCourte) {
        this.descriptionCourte = descriptionCourte;
    }

    /**
     * Retourne descriptionOffre
     * 
     * @return descriptionOffre
     */
    public String getDescriptionOffre() {
        return descriptionOffre;
    }

    /**
     * Affecte descriptionOffre
     * 
     * @param descriptionOffre descriptionOffre à affecter
     */
    public void setDescriptionOffre(String descriptionOffre) {
        this.descriptionOffre = descriptionOffre;
    }

    /**
     * Retourne avantages
     * 
     * @return avantages
     */
    public String getAvantages() {
        return avantages;
    }

    /**
     * Affecte avantages
     * 
     * @param avantages avantages à affecter
     */
    public void setAvantages(String avantages) {
        this.avantages = avantages;
    }

    /**
     * Retourne benefices
     * 
     * @return benefices
     */
    public String getBenefices() {
        return benefices;
    }

    /**
     * Affecte benefices
     * 
     * @param benefices benefices à affecter
     */
    public void setBenefices(String benefices) {
        this.benefices = benefices;
    }

    /**
     * Retourne coutNominal
     * 
     * @return coutNominal
     */
    public float getCoutNominal() {
        return coutNominal;
    }

    /**
     * Affecte coutNominal
     * 
     * @param coutNominal coutNominal à affecter
     */
    public void setCoutNominal(float coutNominal) {
        this.coutNominal = coutNominal;
    }

    /**
     * Retourne prixUnitaireFixe
     * 
     * @return prixUnitaireFixe
     */
    public float getPrixUnitaireFixe() {
        return prixUnitaireFixe;
    }

    /**
     * Affecte prixUnitaireFixe
     * 
     * @param prixUnitaireFixe prixUnitaireFixe à affecter
     */
    public void setPrixUnitaireFixe(float prixUnitaireFixe) {
        this.prixUnitaireFixe = prixUnitaireFixe;
    }

    /**
     * Retourne borneInferieure
     * 
     * @return borneInferieure
     */
    public int getBorneInferieure() {
        return borneInferieure;
    }

    /**
     * Affecte borneInferieure
     * 
     * @param borneInferieure borneInferieure à affecter
     */
    public void setBorneInferieure(int borneInferieure) {
        this.borneInferieure = borneInferieure;
    }

    /**
     * Retourne borneSuperieure
     * 
     * @return borneSuperieure
     */
    public int getBorneSuperieure() {
        return borneSuperieure;
    }

    /**
     * Affecte borneSuperieur
     * 
     * @param borneSuperieure borneSuperieur à affecter
     */
    public void setBorneSuperieure(int borneSuperieure) {
        this.borneSuperieure = borneSuperieure;
    }

    /**
     * Retourne coutUnitaire
     * 
     * @return coutUnitaire
     */
    public float getCoutUnitaire() {
        return coutUnitaire;
    }

    /**
     * Affecte coutUnitaire
     * 
     * @param coutUnitaire coutUnitaire à affecter
     */
    public void setCoutUnitaire(float coutUnitaire) {
        this.coutUnitaire = coutUnitaire;
    }

    /**
     * Retourne listePrixDegressifProduit
     * 
     * @return listePrixDegressifProduit
     */
    public List<PrixDegressif> getListePrixDegressifProduit() {
        return listePrixDegressifProduit;
    }

    /**
     * Affecte listePrixDegressifProduit
     * 
     * @param listePrixDegressifProduit listePrixDegressifProduit à affecter
     */
    public void setListePrixDegressifProduit(List<PrixDegressif> listePrixDegressifProduit) {
        this.listePrixDegressifProduit = listePrixDegressifProduit;
    }

    /**
     * Retourne listeOptions
     * 
     * @return listeOptions
     */
    public List<Option> getListeOptions() {
        return listeOptions;
    }

    /**
     * Affecte listeOptions
     * 
     * @param listeOptions listeOptions à affecter
     */
    public void setListeOptions(List<Option> listeOptions) {
        this.listeOptions = listeOptions;
    }

    /**
     * Retourne afficherPartieNouvelleOption
     * 
     * @return afficherPartieNouvelleOption
     */
    public boolean isAfficherPartieNouvelleOption() {
        return afficherPartieNouvelleOption;
    }

    /**
     * Affecte afficherPartieNouvelleOption
     * 
     * @param afficherPartieNouvelleOption afficherPartieNouvelleOption à
     *            affecter
     */
    public void setAfficherPartieNouvelleOption(boolean afficherPartieNouvelleOption) {
        this.afficherPartieNouvelleOption = afficherPartieNouvelleOption;
    }

    /**
     * Retourne optionNom
     * 
     * @return optionNom
     */
    public String getOptionNom() {
        return optionNom;
    }

    /**
     * Affecte optionNom
     * 
     * @param optionNom optionNom à affecter
     */
    public void setOptionNom(String optionNom) {
        this.optionNom = optionNom;
    }

    /**
     * Retourne optionReference
     * 
     * @return optionReference
     */
    public String getOptionReference() {
        return optionReference;
    }

    /**
     * Affecte optionReference
     * 
     * @param optionReference optionReference à affecter
     */
    public void setOptionReference(String optionReference) {
        this.optionReference = optionReference;
    }

    /**
     * Retourne listeOptionPrixDegressifProduit
     * 
     * @return listeOptionPrixDegressifProduit
     */
    public List<PrixDegressif> getListeOptionPrixDegressifProduit() {
        return listeOptionPrixDegressifProduit;
    }

    /**
     * Affecte listeOptionPrixDegressifProduit
     * 
     * @param listeOptionPrixDegressifProduit listeOptionPrixDegressifProduit à
     *            affecter
     */
    public void setListeOptionPrixDegressifProduit(
            List<PrixDegressif> listeOptionPrixDegressifProduit) {
        this.listeOptionPrixDegressifProduit = listeOptionPrixDegressifProduit;
    }

    /**
     * Retourne optionSelectionne
     * 
     * @return optionSelectionne
     */
    public Option getOptionSelectionne() {
        return optionSelectionne;
    }

    /**
     * Affecte optionSelectionne
     * 
     * @param optionSelectionne optionSelectionne à affecter
     */
    public void setOptionSelectionne(Option optionSelectionne) {
        this.optionSelectionne = optionSelectionne;
    }

    /**
     * Retourne optionCoutNominal
     * 
     * @return optionCoutNominal
     */
    public float getOptionCoutNominal() {
        return optionCoutNominal;
    }

    /**
     * Affecte optionCoutNominal
     * 
     * @param optionCoutNominal optionCoutNominal à affecter
     */
    public void setOptionCoutNominal(float optionCoutNominal) {
        this.optionCoutNominal = optionCoutNominal;
    }

    /**
     * Retourne optionObligatoire
     * 
     * @return optionObligatoire
     */
    public boolean isOptionObligatoire() {
        return optionObligatoire;
    }

    /**
     * Affecte optionObligatoire
     * 
     * @param optionObligatoire optionObligatoire à affecter
     */
    public void setOptionObligatoire(boolean optionObligatoire) {
        this.optionObligatoire = optionObligatoire;
    }

    /**
     * Retourne optionCoutUnitaireFixe
     * 
     * @return optionCoutUnitaireFixe
     */
    public float getOptionCoutUnitaireFixe() {
        return optionCoutUnitaireFixe;
    }

    /**
     * Affecte optionCoutUnitaireFixe
     * 
     * @param optionCoutUnitaireFixe optionCoutUnitaireFixe à affecter
     */
    public void setOptionCoutUnitaireFixe(float optionCoutUnitaireFixe) {
        this.optionCoutUnitaireFixe = optionCoutUnitaireFixe;
    }

    /**
     * Retourne optionBorneInferieure
     * 
     * @return optionBorneInferieure
     */
    public int getOptionBorneInferieure() {
        return optionBorneInferieure;
    }

    /**
     * Affecte optionBorneInferieure
     * 
     * @param optionBorneInferieure optionBorneInferieure à affecter
     */
    public void setOptionBorneInferieure(int optionBorneInferieure) {
        this.optionBorneInferieure = optionBorneInferieure;
    }

    /**
     * Retourne optionBorneSuperieure
     * 
     * @return optionBorneSuperieure
     */
    public int getOptionBorneSuperieure() {
        return optionBorneSuperieure;
    }

    /**
     * Affecte optionBorneSuperieure
     * 
     * @param optionBorneSuperieure optionBorneSuperieure à affecter
     */
    public void setOptionBorneSuperieure(int optionBorneSuperieure) {
        this.optionBorneSuperieure = optionBorneSuperieure;
    }

    /**
     * Retourne optionCoutUnitaire
     * 
     * @return optionCoutUnitaire
     */
    public float getOptionCoutUnitaire() {
        return optionCoutUnitaire;
    }

    /**
     * Affecte optionCoutUnitaire
     * 
     * @param optionCoutUnitaire optionCoutUnitaire à affecter
     */
    public void setOptionCoutUnitaire(float optionCoutUnitaire) {
        this.optionCoutUnitaire = optionCoutUnitaire;
    }

    // ===== Classes imbriquées ===============================================

    /**
     * Retourne optionAvantModification
     * 
     * @return optionAvantModification
     */
    public Option getOptionAvantModification() {
        return optionAvantModification;
    }

    /**
     * Affecte optionAvantModification
     * 
     * @param optionAvantModification optionAvantModification à affecter
     */
    public void setOptionAvantModification(Option optionAvantModification) {
        this.optionAvantModification = optionAvantModification;
    }

    public class Option {

        private String nom = "";

        private String reference = "";

        private boolean obligatoire;

        private float coutUnitaireFixe;

        private List<PrixDegressif> listePrixDegressif = new ArrayList<PrixDegressif>();

        public Option(String nom, String reference, boolean obligatoire) {
            super();
            this.nom = nom;
            this.reference = reference;
            this.obligatoire = obligatoire;
        }

        /**
         * Retourne nom
         * 
         * @return nom
         */
        public String getNom() {
            return nom;
        }

        /**
         * Affecte nom
         * 
         * @param nom nom à affecter
         */
        public void setNom(String nom) {
            this.nom = nom;
        }

        /**
         * Retourne reference
         * 
         * @return reference
         */
        public String getReference() {
            return reference;
        }

        /**
         * Affecte reference
         * 
         * @param reference reference à affecter
         */
        public void setReference(String reference) {
            this.reference = reference;
        }

        /**
         * Retourne obligatoire
         * 
         * @return obligatoire
         */
        public boolean isObligatoire() {
            return obligatoire;
        }

        /**
         * Affecte obligatoire
         * 
         * @param obligatoire obligatoire à affecter
         */
        public void setObligatoire(boolean obligatoire) {
            this.obligatoire = obligatoire;
        }

        /**
         * Retourne coutUnitaireFixe
         * 
         * @return coutUnitaireFixe
         */
        public float getCoutUnitaireFixe() {
            return coutUnitaireFixe;
        }

        /**
         * Affecte coutUnitaireFixe
         * 
         * @param coutUnitaireFixe coutUnitaire à affecter
         */
        public void setCoutUnitaireFixe(float coutUnitaireFixe) {
            this.coutUnitaireFixe = coutUnitaireFixe;
        }

        /**
         * Retourne listePrixDegressif
         * 
         * @return listePrixDegressif
         */
        public List<PrixDegressif> getListePrixDegressif() {
            return listePrixDegressif;
        }

        /**
         * Affecte listePrixDegressif
         * 
         * @param listePrixDegressif listePrixDegressif à affecter
         */
        public void setListePrixDegressif(List<PrixDegressif> listePrixDegressif) {
            this.listePrixDegressif = listePrixDegressif;
        }

    }

    public class PrixDegressif {

        private int borneInferieure;

        private int borneSuperieure;

        private float prixUnitaire;

        public PrixDegressif(int borneInferieure, int borneSuperieure, float prixUnitaire) {
            super();
            this.borneInferieure = borneInferieure;
            this.borneSuperieure = borneSuperieure;
            this.prixUnitaire = prixUnitaire;
        }

        /**
         * Retourne borneInferieure
         * 
         * @return borneInferieure
         */
        public int getBorneInferieure() {
            return borneInferieure;
        }

        /**
         * Affecte borneInferieure
         * 
         * @param borneInferieure borneInferieure à affecter
         */
        public void setBorneInferieure(int borneInferieure) {
            this.borneInferieure = borneInferieure;
        }

        /**
         * Retourne borneSuperieure
         * 
         * @return borneSuperieure
         */
        public int getBorneSuperieure() {
            return borneSuperieure;
        }

        /**
         * Affecte borneSuperieure
         * 
         * @param borneSuperieure borneSuperieure à affecter
         */
        public void setBorneSuperieure(int borneSuperieure) {
            this.borneSuperieure = borneSuperieure;
        }

        /**
         * Retourne prixUnitaire
         * 
         * @return prixUnitaire
         */
        public float getPrixUnitaire() {
            return prixUnitaire;
        }

        /**
         * Affecte prixUnitaire
         * 
         * @param prixUnitaire prixUnitaire à affecter
         */
        public void setPrixUnitaire(float prixUnitaire) {
            this.prixUnitaire = prixUnitaire;
        }
    }
}
