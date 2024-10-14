# Galois Counter Mode

## Overview

This repository contains an implementation of AES-GCM (Advanced Encryption Standard in Galois/Counter Mode), an authenticated encryption scheme that provides both confidentiality and integrity of data. It integrates AES (Advanced Encryption Standard) encryption and multiplication in GF(2^128) (Galois Field), combining them into a complete AES-GCM encryption and decryption protocol.

AES-GCM is widely used in secure communications, ensuring both the secrecy of the data and that the data has not been tampered with.

## Features

- **AES-CTR Mode Encryption**: Encrypts plaintext data using AES in Counter (CTR) mode.
- **Authenticated Tag Generation**: Computes an authentication tag over both the encrypted data (ciphertext) and additional associated data (AAD), ensuring data integrity.
- **Decryption with Tag Verification**: Decrypts ciphertext and verifies the authentication tag to ensure that neither the ciphertext nor the AAD has been modified.
- **Support for Associated Data (AAD)**: Authenticates additional data that is not encrypted but should be protected from modification.

