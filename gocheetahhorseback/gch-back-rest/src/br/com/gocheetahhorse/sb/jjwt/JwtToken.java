package br.com.gocheetahhorse.sb.jjwt;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

import br.com.gocheetahhorse.sb.model.Login;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

public class JwtToken {


    private static final Key secret = MacProvider.generateKey(SignatureAlgorithm.HS256);
    private static final byte[] secretBytes = secret.getEncoded();
    private static final String base64SecretBytes = Base64.getEncoder().encodeToString(secretBytes);

    public static String generateToken(Login login) {
        Date now = new Date();
        Date exp = new Date(System.currentTimeMillis() + (1000 * 30)); // 30 seconds

        String token = Jwts.builder()
            .setId(login.getCpf())
            .setIssuedAt(now)
            .setNotBefore(now)
            .setExpiration(exp)
            .signWith(SignatureAlgorithm.HS256, base64SecretBytes)
            .compact();

        return token;
    }

    public static boolean verifyToken(String token) {
        try {
			Claims claims = Jwts.parser().setSigningKey(base64SecretBytes).parseClaimsJws(token).getBody();
			System.out.println("----------------------------");
			System.out.println("ID: " + claims.getId());
			System.out.println("Subject: " + claims.getSubject());
			System.out.println("Issuer: " + claims.getIssuer());
			System.out.println("Expiration: " + claims.getExpiration());
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return false;
    }
}
