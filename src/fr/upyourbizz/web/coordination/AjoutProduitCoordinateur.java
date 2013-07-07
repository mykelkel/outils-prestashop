package fr.upyourbizz.web.coordination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.upyourbizz.web.service.GestionProduitService;

public class AjoutProduitCoordinateur {

    // ===== Attributs statiques ==============================================

    @SuppressWarnings("unused")
    private final Logger logger = LoggerFactory.getLogger(AjoutProduitCoordinateur.class);

    // ===== Méthodes statiques ===============================================

    // ===== Attributs ========================================================

    private GestionProduitService gestionProduitService;

    // ===== Constructeurs ====================================================

    // ===== Méthodes =========================================================

    // TODO Corps de classe auto-généré

    // ===== Accesseurs =======================================================

    /**
     * Affecte gestionProduitService
     * 
     * @param gestionProduitService gestionProduitService à affecter
     */
    public void setGestionProduitService(GestionProduitService gestionProduitService) {
        this.gestionProduitService = gestionProduitService;
    }

    // ===== Classes imbriquées ===============================================
}
