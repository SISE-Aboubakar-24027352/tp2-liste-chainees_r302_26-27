# TP 2 : Listes chaînées 

## **1 Opérations fondamentales** 

L’essentiel de ces exercices _fondamentaux_ consiste à implémenter les opérations élémentaires pour différents types de listes. **Il s’agit de travailler le CM** , qui explique la plupart de ces opérations, et donne le code de base pour les différentes structures à manipuler. 

Dans toutes les questions “ _fondamentales_ ” on supposera des structures **sans sentinelles** . 

### **1.1 Liste simple d’entiers** 

Implémenter une définition récursive de liste simplement chaînée pour des éléments de type `Integer` qui supporte les opérations suivantes : 

`size()` **:** retourne le nombre d’éléments contenus dans la liste 

`isEmpty()` **:** retourne **true** si la liste est vide, et **false** sinon 

`first()` **:** retourne (mais ne supprime pas) le premier élément dans la liste 

`last()` **:** retrourne (mais ne supprime pas) le dernier élément dans la liste àddFirst(e)` **:** ajoute un nouvel élément en début de liste 

`addLast(e)` **:** ajoute un nouvel élément en fin de liste 

`removeFirst()` **:** supprime et retourne le premier élément de la liste 

Pour cela, tenir compte des remarques suivantes. 

- Si first (), last () ou removeFirst() sont appelées depuis une liste vide on retournera simplemene **null** sans modifier la liste. 

- On utilisera la notion Java de **classe interne statique** (ou _nested class_ ) pour définir une classe **private static** Node dont la portée sera limitée à la classe **public** SinglyListClass. Consulter la doc java pour plus de détails : `https://docs.oracle.com/javase/tutorial/ java/javaOO/nested.html` 

- Quelle différence cela ferait-il si la classe Node n’était pas déclarée **static** ? Consulter la doc java. 

### **1.2 Liste simple : questions subsidiaires** 

1. Proposer et implémenter un algorithme pour trouver l’avant-dernier nœud dans une liste simplement chaînée où le dernier élément est repéré par sa référence nulle au suivant. 

2. Décrire, puis implémenter un algorithme pour inverser les éléments d’une liste simplement chaînée, en utilisant seulement une quantité **constante** d’espace supplémentaire, et sans utiliser de récursivité. 

3. Décrire en détail, puis implémenter comment échanger 2 nœuds _x_ et _y_ (et pas seulement leurs contenus) dans une liste simplement chaînée, étant données les références vers _x_ et _y_ , et seulement ces références. 

### **1.3 Liste double d’entiers** 

Implémenter une structure de liste doublement chainée en s’inspirant du code de la liste simple. 

### **1.4 Liste double : questions subsidiaires** 

1. Ecrire<sup>´</sup> une méthode qui compte le nombre de nœuds dans une liste chaînée **circulaire** . 

2. Implémenter la méthode equals() pour une liste doublemement chaînée. 

### **1.5 élements génériques** 

écrire la classe MyLinkedList _<_ T _>_ **implements** List _<_ T _>_ , qui implémente une structure générique de liste doublement chaînée. Un objet de ce type pourra donc recevoir des éléments d’un type référence quelconque, sur le modèle de la classe existante LinkedList _<_ T _>_ . Vous lirez la javadoc de LinkedList _<_ T _>_ et celle de List _<_ T _>_ pour la description des méthodes membres que vous choisirez d’implémenter. 

Tester avec un programme qui permet de maintenir les 10 meilleurs scores d’une application de jeu, en utilisant une liste chaînée. 

## **2 Aller plus loin** 

1. Implémenter une classe de liste circulaire. 

2. Etant<sup>´</sup> donnée 1 liste circulaire containant un nombre _pair_ de nœuds, écrire une méthode qui divise la liste en 2 listes circulaires, chacune de la moitié de la taille initiale. 

3. Implémenter une méthode non-récursive de recherche du milieu d’une liste doublement chaînée, en ne procédant que par parcours des liens. Attention ! Cette méthode ne peut **pas** utiliser de compteur. 

4. Implémenter une structure de liste doublement chaînée avec sentinelles de tête et queue, et la munir des opérations de base. Tester. 

5. Implémenter une méthode pour concaténer 2 listes doublement chaînées _L_ et _M_ , avec sentinelles de tête et queue, en une liste unique L’. 

