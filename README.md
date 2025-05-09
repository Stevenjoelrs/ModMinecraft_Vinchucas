# VINCHUCA MOD

> [!WARNING]
> Este mod aún está en desarrollo. Algunas funciones pueden no estar completas o pueden cambiar en futuras versiones.

En desarrollo para Minecraft 1.21.5 - Forge

<p align="center">
  <img src=".github/assets/vinchucas-vs-player.png" alt="Player atacado por vinchucas." width="600">
</p>

> El mob de vinchucas solo es hostil a jugadores, la imagen es solo referencial.

## Descripción

Este mod introduce una nueva entidad hostil: la *vinchuca*. Inspirada en su contraparte real, implementando el mal de Chagas. 

## Descarga
> [!IMPORTANT]
> El mod aún no tiene una versión oficial. Si deseas probarlo, puedes seguir los pasos a continuación para compilar el archivo .jar.

<details>
  <summary>Instrucciones para compilar el mod.</summary>

  ### Requisitos
  - JDK LTS 21.
  - Gradle (opcional, puedes usar el wrapper incluido).
  - Minecraft Forge 1.21.5.

  ### Pasos para construir el mod

  1. Clona el repositorio:
     ```bash
     git clone https://github.com/Stevenjoelrs/ModMinecraft_Vinchucas
     cd ModMinecraft_Vinchucas
     ```

  2. Ejecuta el siguiente comando para la compilación:
     ```bash
     ./gradlew build
     ```

  3. El `.jar` generado estará en `build/libs/`.

  4. Coloca el archivo `.jar` en tu carpeta de mods de Minecraft.

</details>

## Impementaciones
### Vinchuca
<p align="center">
  <img src=".github/assets/vinchuca-minecraft.png" alt="vista previa de la vinchuca en minecraft - 1" width="300">
  <img src=".github/assets/vinchuca-minecraft-2.png" alt="vista previa de la vinchuca en minecraft - 2" width="300">
</p>

#### Modelo
<p align="center">
  <img src=".github/assets/vinchuca-model-3.png" alt="modelo 3D de la vinchuca" width="200">
  <img src=".github/assets/vinchuca-model-2.png" alt="modelo 3D de la vinchuca" width="200">
  <img src=".github/assets/vinchuca-model-1.png" alt="modelo 3D de la vinchuca" width="200">
</p>

### Mal de Chagas
<p align="center">
  <img src=".github/assets/imagenDeComando.png" alt="Comando de Mal de Chagas" width="600">
</p>

> Comando para asignar efecto al jugador.

<p align="center">
  <img src=".github/assets/efectoEnJugador.png" alt="Efecto Mal de Chagas en Jugador" width="600">
</p>

> Efecto asignado al jugador.

<p align="center">
  <img src=".github/assets/mal-de-chagas-minecraft.png" alt="Efecto Mal de Chagas" width="600">
</p>

> De momento el efecto no tiene un icono asignado, pero sus efectos como generar 2 puntos de daño cada 20 ticks cuando se tiene <= 19 puntos de comida si funciona.

### Item de Curacion 
<p align="center">
  <img src=".github/assets/itemInventario.jpg" alt="El item aparece en el inventario." width="600">
</p>


> El item aparece correctamente en el inventario en la seccion `food & drinks.`

<p align="center">
  <img src=".github/assets/cosumirItem.png" alt="El item es consumible." width="600">
</p>


> El item `antidoto del chagas` es consumible.

# TO DO

- [x] Mob funcional.
- [x] Efecto funcional.
- [x] Cura funcional.
- [ ] Mob aplica efecto de chagas al golpear al jugador.
- [ ] Mob Spawnea solo en bloques de adobe.
- [ ] Crafteo funcional para el item de cura.
- [ ] El efecto solo puede desaparecer con la cura del mod.
- [ ] Texturas para el mob.
- [ ] Texturas para el efecto.
- [ ] Texturas para la poción de cura.
