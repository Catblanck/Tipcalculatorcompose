# Tip Calculator Compose Multiplatform

## Descripción del proyecto

Este proyecto consiste en una aplicación de cálculo de propinas desarrollada con **Kotlin Compose Multiplatform** utilizando el patrón **MVVM (Model-View-ViewModel)**.

La aplicación permite al usuario ingresar el **monto de la cuenta**, el **porcentaje de propina** y seleccionar la opción de **redondear la propina**, mostrando automáticamente el resultado del cálculo en la interfaz.

El objetivo principal del proyecto es demostrar cómo **separar la lógica de negocio de la interfaz gráfica** utilizando un **ViewModel compartido** y reutilizar la lógica en múltiples plataformas como **Desktop y Android**.

La aplicación calcula la propina automáticamente cuando el usuario modifica cualquiera de los valores ingresados, siguiendo el enfoque reactivo de Jetpack Compose. ([Android Developers][1])

---

# Tecnologías utilizadas

* Kotlin
* Compose Multiplatform
* Jetpack Compose
* Material 3
* ViewModel
* Gradle Kotlin DSL

---

# Arquitectura del proyecto

El proyecto utiliza una arquitectura **MVVM**, donde:

**View (UI)**
Se encuentra en los composables de `commonMain` y es responsable de mostrar la interfaz al usuario.

**ViewModel**
Contiene la lógica de negocio de la aplicación, como el cálculo de la propina y el manejo del estado de la UI.

**Model**
Representa los datos que utiliza la aplicación para realizar los cálculos.

---

# Funcionamiento de la aplicación

La aplicación permite:

* Ingresar el **monto de la cuenta**
* Ingresar el **porcentaje de propina**
* Activar o desactivar la opción de **redondear la propina**
* Ver el **resultado calculado automáticamente**

La propina se calcula mediante la fórmula:

```
propina = monto * porcentaje / 100
```

Si la opción **Round Up** está activada, la propina se redondea utilizando la función `ceil()`.

---

# Ejecución del proyecto

## Ejecutar en Desktop

1. Clonar el repositorio:

```
git clone https://github.com/Catblanck/Tipcalculatorcompose.git
```

2. Abrir el proyecto en **IntelliJ IDEA o Android Studio**.

3. Esperar a que Gradle sincronice las dependencias.

4. Ejecutar la aplicación usando la tarea:

```
jvmRun
```

Esto abrirá la aplicación en una ventana de escritorio.

---

## Ejecutar en Android

1. Abrir el proyecto en **Android Studio**.
2. Conectar un dispositivo Android o iniciar un emulador.
3. Ejecutar el proyecto desde el módulo Android.

---

# Resultados

La aplicación funciona correctamente en **Desktop y Android**, permitiendo calcular propinas en tiempo real conforme el usuario ingresa datos.

Se logró:

* Compartir la lógica entre plataformas.
* Separar correctamente la lógica de negocio usando ViewModel.
* Implementar una interfaz moderna utilizando Material 3.
* Manejar el estado de la aplicación de manera reactiva.

---

# Conclusiones

El desarrollo de este proyecto permitió comprender el uso de **Kotlin Compose Multiplatform** para crear aplicaciones que pueden ejecutarse en diferentes plataformas utilizando una sola base de código.

Además, se aplicó el patrón **MVVM**, lo cual facilita la separación entre la lógica de negocio y la interfaz de usuario, mejorando la organización y mantenimiento del código.

El uso de **ViewModel** permitió mantener el estado de la aplicación durante las recomposiciones de la interfaz y gestionar adecuadamente el ciclo de vida de los componentes.

Este enfoque demuestra cómo es posible construir aplicaciones modernas, reutilizables y escalables utilizando las herramientas actuales del ecosistema Kotlin y Compose.





This is a Kotlin Multiplatform project targeting Android, Desktop (JVM).

* [/composeApp](./composeApp/src) is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
    - [commonMain](./composeApp/src/commonMain/kotlin) is for code that’s common for all targets.
    - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
      For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
      the [iosMain](./composeApp/src/iosMain/kotlin) folder would be the right place for such calls.
      Similarly, if you want to edit the Desktop (JVM) specific part, the [jvmMain](./composeApp/src/jvmMain/kotlin)
      folder is the appropriate location.

### Build and Run Android Application

To build and run the development version of the Android app, use the run configuration from the run widget
in your IDE’s toolbar or build it directly from the terminal:

- on macOS/Linux
  ```shell
  ./gradlew :composeApp:assembleDebug
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:assembleDebug
  ```

### Build and Run Desktop (JVM) Application

To build and run the development version of the desktop app, use the run configuration from the run widget
in your IDE’s toolbar or run it directly from the terminal:

- on macOS/Linux
  ```shell
  ./gradlew :composeApp:run
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:run
  ```

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…