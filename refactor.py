import os
import shutil

base_dir = r"b:\_DEV-1129_\Workspace_Antigravity\GITHUB\Herencia_POO_01\src\com\herencia"

mappings = {
    "basica/Vehiculo.java": "vehiculos/Vehiculo.java",
    "basica/Coche.java": "vehiculos/Coche.java",
    "polimorfismo/Animal.java": "animales/Animal.java",
    "polimorfismo/Perro.java": "animales/Perro.java",
    "interfaces/Nadador.java": "animales/Nadador.java",
    "interfaces/Volador.java": "animales/Volador.java",
    "interfaces/Pato.java": "animales/Pato.java",
    "abstractas/Figura.java": "geometria/Figura.java",
    "abstractas/Circulo.java": "geometria/Circulo.java",
    "abstractas/Rectangulo.java": "geometria/Rectangulo.java",
    "finals/ConstanteClase.java": "utilidades/ConstanteClase.java",
    "Main.java": "Main.java"
}

pkg_replacements = {
    "package com.herencia.basica;": "package com.herencia.vehiculos;",
    "package com.herencia.polimorfismo;": "package com.herencia.animales;",
    "package com.herencia.interfaces;": "package com.herencia.animales;",
    "package com.herencia.abstractas;": "package com.herencia.geometria;",
    "package com.herencia.finals;": "package com.herencia.utilidades;",
}

import_replacements = {
    "import com.herencia.basica.Vehiculo;": "import com.herencia.vehiculos.Vehiculo;",
    "import com.herencia.basica.Coche;": "import com.herencia.vehiculos.Coche;",
    "import com.herencia.polimorfismo.Animal;": "import com.herencia.animales.Animal;",
    "import com.herencia.polimorfismo.Perro;": "import com.herencia.animales.Perro;",
    "import com.herencia.abstractas.Figura;": "import com.herencia.geometria.Figura;",
    "import com.herencia.abstractas.Circulo;": "import com.herencia.geometria.Circulo;",
    "import com.herencia.abstractas.Rectangulo;": "import com.herencia.geometria.Rectangulo;",
    "import com.herencia.interfaces.Volador;": "import com.herencia.animales.Volador;",
    "import com.herencia.interfaces.Nadador;": "import com.herencia.animales.Nadador;",
    "import com.herencia.interfaces.Pato;": "import com.herencia.animales.Pato;",
    "import com.herencia.finals.ConstanteClase;": "import com.herencia.utilidades.ConstanteClase;"
}

# Create dirs
for d in ["vehiculos", "animales", "geometria", "utilidades"]:
    os.makedirs(os.path.join(base_dir, d), exist_ok=True)

# Process files
for old_rel, new_rel in mappings.items():
    old_path = os.path.join(base_dir, old_rel)
    new_path = os.path.join(base_dir, new_rel)
    
    if os.path.exists(old_path):
        with open(old_path, "r", encoding="utf-8") as f:
            content = f.read()
            
        # Replace packages
        for old_pkg, new_pkg in pkg_replacements.items():
            content = content.replace(old_pkg, new_pkg)
            
        # Replace imports
        for old_imp, new_imp in import_replacements.items():
            content = content.replace(old_imp, new_imp)
            
        # Remove redundant cross imports within the same package
        lines = content.split('\n')
        final_lines = []
        
        file_pkg = ""
        for p_old, p_new in pkg_replacements.items():
            if content.find(p_new) != -1:
                file_pkg = p_new.replace("package ", "").replace(";", "").strip()
                break
                
        for line in lines:
            if line.startswith("import com.herencia."):
                if file_pkg and line.startswith(f"import {file_pkg}."):
                    continue # Skip redundant import
            final_lines.append(line)
            
        content = '\n'.join(final_lines)
            
        with open(new_path, "w", encoding="utf-8") as f:
            f.write(content)

# Remove old dirs
for d in ["basica", "polimorfismo", "interfaces", "abstractas", "finals"]:
    d_path = os.path.join(base_dir, d)
    if os.path.exists(d_path):
        shutil.rmtree(d_path)
