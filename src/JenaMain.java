

import org.apache.jena.base.Sys;
import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Statement;
public class JenaMain {
    public static void main(String[] args) {


        String ns= "http://recyclingProject.com/";
        OntModel model= ModelFactory.createOntologyModel();
        model.setNsPrefix("", ns);

        //__________________________________________________________________________________________________

        //classes
        OntClass Utilisateur = model.createClass(ns +"Utilisateur");
        OntClass ZoneDeCollecte = model.createClass(ns +"ZoneDeCollecte");
        OntClass ServiceDechet = model.createClass(ns +"ServiceDechet");
        OntClass ProcedeRecyclage = model.createClass(ns +"ProcedeRecyclage");
        OntClass PratiqueRecyclage = model.createClass(ns +"PratiqueRecyclage");
        OntClass MateriauRecyclable = model.createClass(ns +"MateriauRecyclable");
        OntClass Evenement = model.createClass(ns +"Evenement");
        OntClass Dechet = model.createClass(ns +"Dechet");
        OntClass Communaute = model.createClass(ns +"Communaute");
        OntClass CentreDeRecyclage = model.createClass(ns +"CentreDeRecyclage");
        OntClass CompagneSensibilisation = model.createClass(ns +"CompagneSensibilisation");
        OntClass TypeDechet = model.createClass(ns +"TypeDechet");

        //__________________________________________________________________________________________________
        // sub class
        OntClass collectDechet = model.createClass(ns + "CollectDechet");
        Evenement.addSubClass(collectDechet);

        OntClass Organisateur = model.createClass(ns + "Organisateur");
        Utilisateur.addSubClass(Organisateur);

        OntClass Citoyen = model.createClass(ns + "Citoyen");
        Utilisateur.addSubClass(Citoyen);



        //__________________________________________________________________________________________________
        //Relationship

        ObjectProperty accepte = model.createObjectProperty(ns +"accepte");
        ObjectProperty appartient_a = model.createObjectProperty(ns +"appartient_a");
        ObjectProperty estRecyclePar = model.createObjectProperty(ns +"estRecyclePar");
        ObjectProperty organise = model.createObjectProperty(ns +"organise");
        ObjectProperty participe_a = model.createObjectProperty(ns +"participe_a");
        ObjectProperty produitDechet = model.createObjectProperty(ns +"produitDechet");
        ObjectProperty se_sitier_a = model.createObjectProperty(ns +"se_sitier_a");
        ObjectProperty utilise = model.createObjectProperty(ns +"utilise");

        //__________________________________________________________________________________________________

        //indiv

        //Utilisateur

        Individual EcoVolunteer=model.createIndividual(ns + "EcoVolunteer",Organisateur);
        Individual GreenManager=model.createIndividual(ns + "GreenManager",Organisateur);
        Individual JeanDupont=model.createIndividual(ns + "JeanDupont",Utilisateur);
        Individual MarieCivique=model.createIndividual(ns + "MarieCivique",Utilisateur);


        //Zone Collect

       Individual LilleNord   =model.createIndividual(ns + "LilleNord",ZoneDeCollecte);
       Individual LyonSud   =model.createIndividual(ns + "LyonSud",ZoneDeCollecte);
       Individual MarseilleCentre   =model.createIndividual(ns + "MarseilleCentre",ZoneDeCollecte);
       Individual ParisEst   =model.createIndividual(ns + "ParisEst",ZoneDeCollecte);


        //Type dechet


        Individual Megots_de_cigarette   =model.createIndividual(ns + "Megots_de_cigarette",TypeDechet);
        Individual Metal   =model.createIndividual(ns + "Metal",TypeDechet);
        Individual Papier   =model.createIndividual(ns + "Papier",TypeDechet);
        Individual Plastique   =model.createIndividual(ns + "Plastique",TypeDechet);
        Individual Vaisselle_en_ceramique   =model.createIndividual(ns + "Vaisselle_en_ceramique",TypeDechet);
        Individual Verre   =model.createIndividual(ns + "Verre",TypeDechet);


        // Service Dechet

        Individual CollecteDechetsManagers   =model.createIndividual(ns + "CollecteDechetsManagers",ServiceDechet);
        Individual RamassageDechetsIndustriels   =model.createIndividual(ns + "RamassageDechetsIndustriels",ServiceDechet);
        Individual ServiceCompostage   =model.createIndividual(ns + "ServiceCompostage",ServiceDechet);
        Individual ServiceTriSelectif   =model.createIndividual(ns + "CollecteDechetsManagers",ServiceDechet);



        //Procedee recyclage



        Individual BroyageVerre   =model.createIndividual(ns + "BroyageVerre",ProcedeRecyclage);
        Individual Compostage   =model.createIndividual(ns + "Compostage",ProcedeRecyclage);
        Individual ExtrusionPlastique   =model.createIndividual(ns + "ExtrusionPlastique",ProcedeRecyclage);
        Individual FonderieAlimunium   =model.createIndividual(ns + "FonderieAlimunium",ProcedeRecyclage);


        //PratiqueRecyclage


        Individual ComostageDomestique   =model.createIndividual(ns + "ComostageDomestique",PratiqueRecyclage);
        Individual RecyclagePapier   =model.createIndividual(ns + "RecyclagePapier",PratiqueRecyclage);
        Individual ReutillsationVerre   =model.createIndividual(ns + "ReutillsationVerre",PratiqueRecyclage);
        Individual TriDesPlastiques   =model.createIndividual(ns + "TriDesPlastiques",PratiqueRecyclage);



        //Materiaux

        Individual canette_en_Aluminium   =model.createIndividual(ns + "canette_en_Aluminium",MateriauRecyclable);
        Individual Materiau_recyclable   =model.createIndividual(ns + "Materiau_recyclable",MateriauRecyclable);
        Individual Papier_Carton   =model.createIndividual(ns + "Papier_Carton",MateriauRecyclable);
        Individual Verre_Transparent   =model.createIndividual(ns + "Verre_Transparent",MateriauRecyclable);


        //Evenement


        Individual collect_de_plastique   =model.createIndividual(ns + "collect_de_plastique",Evenement);
        Individual Formation_au_compostage   =model.createIndividual(ns + "Formation_au_compostage",Evenement);
        Individual Journee_de_Recyclage   =model.createIndividual(ns + "Journee_de_Recyclage",Evenement);
        Individual Sensibilisation_au_Tri_des_Dechets   =model.createIndividual(ns + "Sensibilisation_au_Tri_des_Dechets",Evenement);



        // Dechet

        Individual BatterieVoiture   =model.createIndividual(ns + "BatterieVoiture",Dechet);
        Individual BouteillePlastique   =model.createIndividual(ns + "BouteillePlastique",Dechet);
        Individual PapierJournal   =model.createIndividual(ns + "PapierJournal",Dechet);
        Individual RestesDeNouritures   =model.createIndividual(ns + "RestesDeNouritures",Dechet);


        //Communaute

        Individual EcoParis   =model.createIndividual(ns + "EcoParis",Communaute);
        Individual GreenLyon   =model.createIndividual(ns + "GreenLyon",Communaute);
        Individual RecycleToulouse   =model.createIndividual(ns + "RecycleToulouse",Communaute);
        Individual ZeroWasteMarseille   =model.createIndividual(ns + "ZeroWasteMarseille",Communaute);


        //Centre De Recyclage

        Individual CentreRecyclageLille   =model.createIndividual(ns + "CentreRecyclageLille",CentreDeRecyclage);
        Individual CentreRecyclageLyon   =model.createIndividual(ns + "CentreRecyclageLyon",CentreDeRecyclage);
        Individual CentreRecyclageMarseille   =model.createIndividual(ns + "CentreRecyclageMarseille",CentreDeRecyclage);
        Individual CentreRecyclageParis  =model.createIndividual(ns + "CentreRecyclageParis",CentreDeRecyclage);


        //Compagne

        Individual CompagneNaturePropre   =model.createIndividual(ns + "CompagneNaturePropre",CompagneSensibilisation);
        Individual CompagnePlagePropre  =model.createIndividual(ns + "CompagnePlagePropre",CompagneSensibilisation);
        Individual CompagneRecyclageParis  =model.createIndividual(ns + "CompagneRecyclageParis",CompagneSensibilisation);
        Individual CompagneZeroDechets  =model.createIndividual(ns + "CompagneZeroDechets",CompagneSensibilisation);

//-----------------------------------------------------------------------------------------------------------------------------------

   // Utilisateur

        JeanDupont.addProperty(participe_a,collectDechet);
        MarieCivique.addProperty(participe_a,collectDechet);
        EcoVolunteer.addProperty(participe_a,collectDechet);
        GreenManager.addProperty(participe_a,collectDechet);

        MarieCivique.addProperty(appartient_a,Communaute);
        JeanDupont.addProperty(appartient_a,Communaute);



        EcoVolunteer.addProperty(appartient_a,Communaute);
        MarieCivique.addProperty(appartient_a,Communaute);


        GreenManager.addProperty(organise,CompagneSensibilisation);
        EcoVolunteer.addProperty(organise,CompagneSensibilisation);



        //----------------------Type Dechets------------------------------------------


        if (!Megots_de_cigarette.hasProperty(appartient_a)) {
            Megots_de_cigarette.addProperty(appartient_a, Dechet);
        }

        if (!Metal.hasProperty(appartient_a)) {
            Metal.addProperty(appartient_a, Dechet);
        }

        if (!Papier.hasProperty(appartient_a)) {
            Papier.addProperty(appartient_a, Dechet);
        }

        if (!Plastique.hasProperty(appartient_a)) {
            Plastique.addProperty(appartient_a, Dechet);
        }

        if (!Vaisselle_en_ceramique.hasProperty(appartient_a)) {
            Vaisselle_en_ceramique.addProperty(appartient_a, Dechet);
        }

        if (!Verre.hasProperty(appartient_a)) {
            Verre.addProperty(appartient_a, Dechet);
        }

        if (!Megots_de_cigarette.hasProperty(accepte)) {
            Megots_de_cigarette.addProperty(accepte, CentreDeRecyclage);
        }

        if (!Metal.hasProperty(accepte)) {
            Metal.addProperty(accepte, CentreDeRecyclage);
        }

        if (!Papier.hasProperty(accepte)) {
            Papier.addProperty(accepte, CentreDeRecyclage);
        }

        if (!Plastique.hasProperty(accepte)) {
            Plastique.addProperty(accepte, CentreDeRecyclage);
        }

        if (!Vaisselle_en_ceramique.hasProperty(accepte)) {
            Vaisselle_en_ceramique.addProperty(accepte, CentreDeRecyclage);
        }

        if (!Verre.hasProperty(accepte)) {
            Verre.addProperty(accepte, CentreDeRecyclage);
        }



        //---------------------Zone de collect-----

        LilleNord.addProperty(se_sitier_a,CentreDeRecyclage);
        LyonSud.addProperty(se_sitier_a,CentreDeRecyclage);
        MarseilleCentre.addProperty(se_sitier_a,CentreDeRecyclage);
        ParisEst.addProperty(se_sitier_a,CentreDeRecyclage);

        //è_________Service Dechet_______

        if (!CollecteDechetsManagers.hasProperty(utilise)) {
            CollecteDechetsManagers.addProperty(utilise, PratiqueRecyclage);
        }

        if (!RamassageDechetsIndustriels.hasProperty(utilise)) {
            RamassageDechetsIndustriels.addProperty(utilise, PratiqueRecyclage);
        }

        if (!ServiceCompostage.hasProperty(utilise)) {
            ServiceCompostage.addProperty(utilise, PratiqueRecyclage);
        }

        if (!ServiceTriSelectif.hasProperty(utilise)) {
            ServiceTriSelectif.addProperty(utilise, PratiqueRecyclage);
        }

        //______Materaux Recyclable_______
        if (!canette_en_Aluminium.hasProperty(estRecyclePar)) {
            canette_en_Aluminium.addProperty(estRecyclePar, ProcedeRecyclage);
        }

        if (!Materiau_recyclable.hasProperty(estRecyclePar)) {
            Materiau_recyclable.addProperty(estRecyclePar, ProcedeRecyclage);
        }

        if (!Papier_Carton.hasProperty(estRecyclePar)) {
            Papier_Carton.addProperty(estRecyclePar, ProcedeRecyclage);
        }

        if (!Verre_Transparent.hasProperty(estRecyclePar)) {
            Verre_Transparent.addProperty(estRecyclePar, ProcedeRecyclage);
        }

        //_________________________EVENEMENT__________

        if (!collect_de_plastique.hasProperty(participe_a)) {
            collect_de_plastique.addProperty(participe_a, Utilisateur);
        }

        if (!Formation_au_compostage.hasProperty(participe_a)) {
            Formation_au_compostage.addProperty(participe_a, Utilisateur);
        }

        if (!Journee_de_Recyclage.hasProperty(participe_a)) {
            Journee_de_Recyclage.addProperty(participe_a, Utilisateur);
        }

        if (!Sensibilisation_au_Tri_des_Dechets.hasProperty(participe_a)) {
            Sensibilisation_au_Tri_des_Dechets.addProperty(participe_a, Utilisateur);
        }

        if (!collect_de_plastique.hasProperty(organise)) {
            collect_de_plastique.addProperty(organise, Organisateur);
        }

        if (!Formation_au_compostage.hasProperty(organise)) {
            Formation_au_compostage.addProperty(organise, Organisateur);
        }

        if (!Journee_de_Recyclage.hasProperty(organise)) {
            Journee_de_Recyclage.addProperty(organise, Organisateur);
        }

        if (!Sensibilisation_au_Tri_des_Dechets.hasProperty(organise)) {
            Sensibilisation_au_Tri_des_Dechets.addProperty(organise, Organisateur);
        }

        //_________________________Dechet______________

        //appartient a
        // Enforce max 1 'TypeDechet' for 'appartient_a'
        if (!BatterieVoiture.hasProperty(appartient_a)) {
            BatterieVoiture.addProperty(appartient_a, TypeDechet);
        }

        if (!BouteillePlastique.hasProperty(appartient_a)) {
            BouteillePlastique.addProperty(appartient_a, TypeDechet);
        }

        if (!PapierJournal.hasProperty(appartient_a)) {
            PapierJournal.addProperty(appartient_a, TypeDechet);
        }

        if (!RestesDeNouritures.hasProperty(appartient_a)) {
            RestesDeNouritures.addProperty(appartient_a, TypeDechet);
        }

        if (!BatterieVoiture.hasProperty(produitDechet)) {
            BatterieVoiture.addProperty(produitDechet, ProcedeRecyclage);
        }

        if (!BouteillePlastique.hasProperty(produitDechet)) {
            BouteillePlastique.addProperty(produitDechet, ProcedeRecyclage);
        }

        if (!PapierJournal.hasProperty(produitDechet)) {
            PapierJournal.addProperty(produitDechet, ProcedeRecyclage);
        }

        if (!RestesDeNouritures.hasProperty(produitDechet)) {
            RestesDeNouritures.addProperty(produitDechet, ProcedeRecyclage);
        }

        if (!BatterieVoiture.hasProperty(accepte)) {
            BatterieVoiture.addProperty(accepte, CentreDeRecyclage);
        }

        if (!BouteillePlastique.hasProperty(accepte)) {
            BouteillePlastique.addProperty(accepte, CentreDeRecyclage);
        }

        if (!PapierJournal.hasProperty(accepte)) {
            PapierJournal.addProperty(accepte, CentreDeRecyclage);
        }

        if (!RestesDeNouritures.hasProperty(accepte)) {
            RestesDeNouritures.addProperty(accepte, CentreDeRecyclage);
        }

        //_________________________Communaute_______________

        if (!EcoParis.hasProperty(appartient_a)) {
            EcoParis.addProperty(appartient_a, Utilisateur);
        }

        if (!GreenLyon.hasProperty(appartient_a)) {
            GreenLyon.addProperty(appartient_a, Utilisateur);
        }

        if (!RecycleToulouse.hasProperty(appartient_a)) {
            RecycleToulouse.addProperty(appartient_a, Utilisateur);
        }

        if (!ZeroWasteMarseille.hasProperty(appartient_a)) {
            ZeroWasteMarseille.addProperty(appartient_a, Utilisateur);
        }

   //______________________Centre Recyclage_______________________
        if (!CentreRecyclageLille.hasProperty(accepte)) {
            CentreRecyclageLille.addProperty(accepte, TypeDechet);
        }
        if (!CentreRecyclageLyon.hasProperty(accepte)) {
            CentreRecyclageLyon.addProperty(accepte, TypeDechet);
        }
        if (!CentreRecyclageParis.hasProperty(accepte)) {
            CentreRecyclageParis.addProperty(accepte, TypeDechet);
        }
        if (!CentreRecyclageMarseille.hasProperty(accepte)) {
            CentreRecyclageMarseille.addProperty(accepte, TypeDechet);
        }

// Ensure only one 'ZoneDeCollecte' is assigned to each center
        if (!CentreRecyclageLille.hasProperty(se_sitier_a)) {
            CentreRecyclageLille.addProperty(se_sitier_a, ZoneDeCollecte);
        }
        if (!CentreRecyclageLyon.hasProperty(se_sitier_a)) {
            CentreRecyclageLyon.addProperty(se_sitier_a, ZoneDeCollecte);
        }
        if (!CentreRecyclageParis.hasProperty(se_sitier_a)) {
            CentreRecyclageParis.addProperty(se_sitier_a, ZoneDeCollecte);
        }
        if (!CentreRecyclageMarseille.hasProperty(se_sitier_a)) {
            CentreRecyclageMarseille.addProperty(se_sitier_a, ZoneDeCollecte);
        }
        //________________Compagne_______________________


        if (!CompagneNaturePropre.hasProperty(organise)) {
            CompagneNaturePropre.addProperty(organise, Organisateur);
        }

        if (!CompagnePlagePropre.hasProperty(organise)) {
            CompagnePlagePropre.addProperty(organise, Organisateur);
        }

        if (!CompagneRecyclageParis.hasProperty(organise)) {
            CompagneRecyclageParis.addProperty(organise, Organisateur);
        }

        if (!CompagneZeroDechets.hasProperty(organise)) {
            CompagneZeroDechets.addProperty(organise, Organisateur);
        }



        //Pratique Recyclable

        if (!RecyclagePapier.hasProperty(utilise)) {
            RecyclagePapier.addProperty(utilise, ServiceDechet);
        }

        if (!ReutillsationVerre.hasProperty(utilise)) {
            ReutillsationVerre.addProperty(utilise, ServiceDechet);
        }

        if (!TriDesPlastiques.hasProperty(utilise)) {
            TriDesPlastiques.addProperty(utilise, ServiceDechet);
        }

        if (!Compostage.hasProperty(utilise)) {
            Compostage.addProperty(utilise, ServiceDechet);
        }

        //__________Procede________

        if (!BroyageVerre.hasProperty(produitDechet)) {
            BroyageVerre.addProperty(produitDechet, Dechet);
        }

        if (!Compostage.hasProperty(produitDechet)) {
            Compostage.addProperty(produitDechet, Dechet);
        }

        if (!ExtrusionPlastique.hasProperty(produitDechet)) {
            ExtrusionPlastique.addProperty(produitDechet, Dechet);
        }

        if (!FonderieAlimunium.hasProperty(produitDechet)) {
            FonderieAlimunium.addProperty(produitDechet, Dechet);
        }

// Ensure min 1 'MateriauRecyclable' for 'estRecyclePar'
        if (!BroyageVerre.hasProperty(estRecyclePar)) {
            BroyageVerre.addProperty(estRecyclePar, MateriauRecyclable);
        }

        if (!Compostage.hasProperty(estRecyclePar)) {
            Compostage.addProperty(estRecyclePar, MateriauRecyclable);
        }

        if (!ExtrusionPlastique.hasProperty(estRecyclePar)) {
            ExtrusionPlastique.addProperty(estRecyclePar, MateriauRecyclable);
        }

        if (!FonderieAlimunium.hasProperty(estRecyclePar)) {
            FonderieAlimunium.addProperty(estRecyclePar, MateriauRecyclable);
        }

        String[] dataProperties = {
                "AcceptationTypeDechet",
                "CapaciteCentre",
                "Cout",
                "Description",
                "Poids",
                "TauxDecomposition",
                "TauxRecyclage",
                "TypeDeDechet",
                "TypeMatériau",
                "VolumeDisponible",
                "adresse",
                "coordonnéesGPS",
                "date_collecte",
                "efficacité",
                "email",
                "lieu",
                "nom",
                "nombreMembres",
                "quantite_dechet",
                "quantitéCollectée",
                "recyclabilité",
                "rôle",
                "typeService",
                "énergieNécessaire",
                "événementsOrganisés",
                "événementsParticipe"
        };
        model.write(System.out, "RDF/XML");




















































    }






}
