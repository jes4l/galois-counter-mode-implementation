package uk.ac.nottingham.cryptography;

import uk.ac.nottingham.cryptography.aes.AES128Encryptor;
import uk.ac.nottingham.cryptography.aes.AES128EncryptorImpl;
import uk.ac.nottingham.cryptography.galois.GF128Multiplier;
import uk.ac.nottingham.cryptography.galois.GF128MultiplierImpl;

import java.util.Arrays;

/**
 * Implementation of AEADCipher that encrypts using AES and calculates
 * a tag using GCM.
 * <p>
 * This class is the primary code file in which you can complete your
 * solution to the coursework.
 */
public class AESGCM implements AEADCipher {

    private final GF128Multiplier GF;
    private final AES128Encryptor encryptor;

    public AESGCM() {
        GF = new GF128MultiplierImpl();
        encryptor = new AES128EncryptorImpl();

        // Add your code here
    }

    @Override
    public void init(AEADParams params) {
        // Add your code here
    }

    @Override
    public void updateAAD(byte[] data) {
        // Add your code here
    }

    @Override
    public void processBlock(byte[] data) {
        // Add your code here
    }

    @Override
    public void finalise(byte[] out) {
        // Add your code here
    }

    @Override
    public void verify(byte[] tag) throws InvalidTagException {
        // Add your code here
    }
}
