# 📘 Avocabo

Avocabo es una aplicación multiplataforma para aprender vocabulario en idiomas extranjeros utilizando la técnica de repaso espaciado. Construido con Kotlin Multiplatform y Firebase.

---

## 🚀 Objetivo del proyecto

Crear una herramienta limpia y sencilla para memorizar palabras de forma efectiva con el algoritmo SM2 (inspirado en Anki).

---

## 🧱 Arquitectura y tecnologías

- Kotlin Multiplatform (Android + iOS)
- Firebase (Auth, Firestore)
- SQLDelight para almacenamiento local
- Arquitectura modular (core, auth, words, repetition, etc.)

---

## 🔑 Autenticación

- Correo electrónico y contraseña
- Inicio de sesión con Google (Firebase Auth)

---

## 📚 Repetición espaciada

- Algoritmo SM2 simplificado
- Cada palabra incluye:
    - Nivel de dificultad
    - Número de repeticiones
    - Fecha del próximo repaso

---

## 🛠 Plan MVP

**Sprint 1**: Arquitectura, autenticación  
**Sprint 2**: Gestión de palabras  
**Sprint 3**: Lógica de repetición  
**Sprint 4**: Estadísticas y mejora

---

## 📦 Futuras funciones

- Categorías de palabras
- Notificaciones (Push)
- Modos adicionales (dictado, opción múltiple)
- Exportar/importar datos