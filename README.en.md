# 📘 Avocabo

Avocabo is a cross-platform language learning app that helps users memorize vocabulary using spaced repetition. Built with Kotlin Multiplatform and integrated with Firebase.

---

## 🚀 Project Goal

Create a clean, minimal, and effective tool to study foreign words using the SM2 algorithm (inspired by Anki).

---

## 🧱 Architecture & Tech

- Kotlin Multiplatform (Android + iOS)
- Firebase (Auth, Firestore)
- SQLDelight for local cache
- Modular architecture (core, auth, words, repetition, etc.)

---

## 🔑 Authentication

- Email/password
- Google Sign-In (via Firebase Authentication)

---

## 📚 Spaced Repetition

- Based on simplified SM2 algorithm
- Each word stores:
    - Difficulty level
    - Successful repetitions
    - Next review date

---

## 🛠 MVP Plan

**Sprint 1**: Architecture, Authentication  
**Sprint 2**: Word management  
**Sprint 3**: Repetition logic  
**Sprint 4**: Stats and polish

---

## 📦 Next Features

- Word categories
- Notifications (Push)
- Extra modes (dictation, multiple choice)
- Export/import