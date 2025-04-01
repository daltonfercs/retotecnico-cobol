# Reto Técnico - COBOL

Se desarrolló una aplicación de línea de comandos (CLI) en Java que procesa un archivo CSV con transacciones bancarias y genera un reporte con la siguiente información:

## 📊 Funcionalidades
- **Balance Final:** Suma de los montos de las transacciones de tipo "Crédito" menos la suma de los montos de las transacciones de tipo "Débito".
- **Transacción de Mayor Monto:** Identificar el ID y el monto de la transacción con el valor más alto.
- **Conteo de Transacciones:** Número total de transacciones para cada tipo ("Crédito" y "Débito").

### 📂 Formato del CSV
```csv
id,tipo,monto
1,Crédito,100.00
2,Débito,50.00
3,Crédito,200.00
4,Débito,75.00
5,Crédito,150.00
```

## 🚀 Tecnologías Utilizadas
- 🖥️ **Lenguaje de Programación:** Java
- 🛠️ **IDE:** IntelliJ IDEA
- 📖 **Manejo de CSV:** `BufferedReader`
- 📁 **Estructura:** Proyecto ejecutable en la carpeta `Proyecto-Ejecutable`
- 📂 **Ubicación de Archivos CSV:** Dentro de la carpeta `Proyecto-Ejecutable`

## 📦 Instalación y Ejecución
### 🔹 **Requisitos Previos**
- Tener instalado **JDK o JRE** (versión 17 en adelante)
- Configurar la variable de entorno `PATH`

### 🔹 **Pasos de Instalación**
```bash
git clone https://github.com/daltonfercs/retotecnico-cobol.git
cd retotecnico-cobol/Proyecto-Ejecutable
```

### 🔹 **Ejecución del Proyecto**
```bash
java -jar retotecnico-cobol.jar
```
Luego, sigue las instrucciones en pantalla.

## 📜 Licencia
Este proyecto está bajo la licencia MIT.

---
**📬 Contacto:** Si tienes alguna pregunta o sugerencia, no dudes en crear un issue o contactarme. 😊


