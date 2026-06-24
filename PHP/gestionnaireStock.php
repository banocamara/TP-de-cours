<?php
$produits=
[
    [
        'nom'=>'Boubou',
        'categorie'=>'Textile',
        'prix'=>145000,
        'stock'=>4,
        'seuil_alerte'=>10
    ],

    [
        'nom'=>'Collier',
        'categorie'=>'Bijoux',
        'prix'=>150000,
        'stock'=>8,
        'seuil_alerte'=>5
    ],

    [
        'nom'=>'Panier tresse',
        'categorie'=>'Decoration',
        'prix'=>175000,
        'stock'=>2,
        'seuil_alerte'=>3
    ],

    [
        'nom'=>'Chocalat',
        'categorie'=>'Alimentaire',
        'prix'=>5000,
        'stock'=>6,
        'seuil_alerte'=>4
    ],

    [
        'nom'=>'Echarpe Wax',
        'categorie'=>'Textile',
        'prix'=>2500,
        'stock'=>8,
        'seuil_alerte'=>6
    ],

    [
        'nom'=>'Oeuf',
        'categorie'=>'Alimentaire',
        'prix'=>4000,
        'stock'=>12,
        'seuil_alerte'=>11
    ],

    [
        'nom'=>'Sac en tissu',
        'categorie'=>'Textile',
        'prix'=>175000,
        'stock'=>2,
        'seuil_alerte'=>3
    ],

    [
        'nom'=>'Status en bois',
        'categorie'=>'Decoration',
        'prix'=>175000,
        'stock'=>5,
        'seuil_alerte'=>4
    ],

    [
        'nom'=>'Tableau africain',
        'categorie'=>'Decoration',
        'prix'=>175000,
        'stock'=>2,
        'seuil_alerte'=>3
    ],

    [
        'nom'=>'Sandeles en cuir',
        'categorie'=>'Textile',
        'prix'=>3000,
        'stock'=>10,
        'seuil_alerte'=>8
    ],

    [
        'nom'=>'Boucles d\'oreilles',
        'categorie'=>'Bijoux',
        'prix'=>8000,
        'stock'=>5,
        'seuil_alerte'=>4
    ],

    [
        'nom'=>'Lampe artisanale',
        'categorie'=>'Decoration',
        'prix'=>15500,
        'stock'=>12,
        'seuil_alerte'=>8
    ]
];

function afficherCatalogue($produits){
    echo"<table border='1'>

    <tr>
        <td>Nom</td>
        <td>Categorie</td>
        <td>Prix</td>
        <td>Stock</td>
        <td>Seuil Alerte</td>
   </tr>";
   foreach($produits as $produit)
    {
        echo"
        <tr>
        <td>".$produit['nom']."</td>
        <td>".$produit['categorie']."</td>
        <td>".$produit['prix']."</td>
        <td>".$produit['stock']."</td>
        <td>".$produit['seuil_alerte']."</td>
       </tr>";
    }
    echo"</table>";  
}

function detecterAlertes($produits){
    $alerte =[];
    foreach($produits as $produit)
        {
            if($produit['stock']<= $produit['seuil_alerte'])
                {
                    $alerte[]=$produit;
                }
        }
    return $alerte;
}

function calculerStatistiques($produits){
    $totalproduit=count($produits);
    
    $prixTotal=0;
    $valeurStock=0;
    $categories =[];
    $prixPlusCher=$produits[0];
    $prixMoinCher=$produits[0];

    foreach($produits as $produit)
        {
            $valeurStock=$valeurStock+$produit['stock']*$produit['prix'];
            $prixTotal+=$produit['prix'];

            if($prixPlusCher['prix']<$produit['prix'])
                {
                   $prixPlusCher= $produit ;
                }
            if($prixMoinCher['prix']>$produit['prix'])
                {
                    $prixMoinCher = $produit;
                }
            $categorie= $produit['categorie'];    
            if(isset($categories[$categorie]))
                {
                    $categories[$categorie]++;
                }
            else{
                $categories[$categorie]=1;
            }
        }
     $prixMoyen= $prixTotal/$totalproduit;
     $max=max($categories);
     $categorieMax= array_search($max,$categories);

     return [
        "Total"=>$totalproduit,
        "Valeur_Stock"=>$valeurStock,
        "Prix_total"=>$prixTotal,
        "Prix_Moyen"=>$prixMoyen,
        "Plus_cher"=>$prixPlusCher["nom"],
        "Moin_cher"=>$prixMoinCher["nom"],
        "Categorie_max"=>$categorieMax
     ];
}
$alerte=detecterAlertes($produits);
$status= calculerStatistiques($produits);

echo"<h3>Tous les produits</h3>";
afficherCatalogue($produits);

echo"<div>
<h3>Les alertes detectees</h3>";
foreach($alerte as $produit)
{
    echo $produit['nom']." stock faible<br>";
};

echo "</div><br>";

echo"<div>
<h3>Statistiques</h3> ";
echo"Tous les produit : ".$status['Total']."<br>";
echo"Produit le plus cher : ".$status['Plus_cher']."<br>";
echo"Produit le moins cher : ".$status['Moin_cher']."<br>";
echo"Valeur total de stock : ".$status['Valeur_Stock']."<br>";
echo"Prix moyen : ".$status['Prix_Moyen']."<br>";
echo"Categorie dominante : ".$status['Categorie_max']."<br>";
echo"</div>";
?>