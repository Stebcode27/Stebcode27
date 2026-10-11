# Salut, moi c'est Azriel 👋

**Développeur logiciel & diplômé en génie biomédical**, basé au Cameroun.
Je construis des logiciels à la croisée de **C++, imagerie médicale et santé**, avec une attention particulière pour les contextes à connectivité limitée.

🔎 **Je recherche un stage ou un poste à temps partiel en développement de logiciels médicaux (SaMD / SiMD).**

---

## 🔬 Projet principal : Lumiaxon

Visionneuse DICOM professionnelle en **C++20 / Qt6**, conçue seule, pour les hôpitaux d'Afrique centrale. Elle fonctionne **entièrement en local**, sans dépendance à des données en ligne.

- **Parser DICOM maison** (zéro Qt, C++ pur) derrière une interface `IDicomBackend`, avec **DCMTK en repli** automatique pour les formats exotiques
- **Rendu 2D** via `QOpenGLWidget` / GLSL (window/level, LUT sur textures 16 bits) et **rendu 3D / MPR** via VTK
- **Architecture en couches** à dépendances strictement unidirectionnelles (`app/`, `core/`, `engine/`, `services/`, `ui/`)
- **Micro-PACS local** (réception C-STORE via DCMTK) et partage par QR code sans internet
- **Démarche qualité** alignée sur IEC 62304 / ISO 14971 : traçabilité, gestion des risques, tests documentés (Catch2), commits signés, GitHub Flow, Conventional Commits, SemVer, CI/CD GitHub Actions *(pratiques d'ingénierie, sans certification)*

**Feuille de route :** V1 visionneuse locale → V2 chatbot LLM local (llama.cpp) → V3 IA sur images médicales (ONNX Runtime)

📚 Documentation : [lumiaxon-docs](https://github.com/Stebcode27/lumiaxon-docs)

## 🩺 Autres projets

| Projet | Description | Stack |
|---|---|---|
| [projet-moniteur](https://github.com/Stebcode27/projet-moniteur) | Moniteur multiparamétrique sur Raspberry Pi 4B | Python, PyQt5 |
| *Acquisition ECG* | Acquisition du signal avec un AD8232 et visualisation temps réel | ESP32, PyQtGraph |

## 🛠️ Compétences

**Langages :** C++ (STL, templates, C++17) · Python · JavaScript
**Frameworks & outils :** Qt6 · OpenGL / GLSL · VTK · DCMTK · CMake · Catch2 · Git / GitHub Actions
**Domaine :** DICOM · imagerie médicale · IEC 62304 · ISO 14971 · systèmes embarqués (ESP32, Raspberry Pi)
**Autres :** React.js

## 📖 En ce moment

- 🔭 Je développe Lumiaxon V1 (couche `model/` et décodage des pixel data)
- 🌱 Spécialisation *Data Structures and Algorithms* (UC San Diego, Coursera) : certificat *Algorithmic Toolbox* obtenu
- 💡 Intérêts : algorithmique, C++ moderne, IA appliquée à l'imagerie médicale

## 🏥 Parcours

- Diplôme en génie biomédical
- Stages en milieu hospitalier à l'Hôpital Général de Douala et à l'hôpital de district de Logbaba, où j'ai observé de près le workflow radiologique qui inspire Lumiaxon

## 📫 Me contacter

- LinkedIn : www.linkedin.com/in/azriel-teuga-735871303
- Email : teugastebane@gmail.com
