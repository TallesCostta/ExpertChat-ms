package br.com.donatti.utils;

/**
 * @author Tales Paiva [tallescosttapaiva@gmail.com] 07/12/2024 - 17:34:38
 */
public final class ConstantsUtils
{
    public static final Integer LIMITE_HISTORICO = 100;
    
    public static final String PADRAO_RESPOSTA = "\"text\"\\s*:\\s*\"([^\"]+)\"";
    
    public static final String GEMINI_API_KEY = System.getenv("${GEMINI_API_KEY}");
    
    public static final String GEMINI_URL = System.getenv("${GEMINI_URL}");
}
