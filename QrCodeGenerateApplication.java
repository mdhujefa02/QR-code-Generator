package com.qrgenerate.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

@Controller
public class QrCodeGenerateApplication {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/generate")
    public String generate(@RequestParam("text") String text, Model model) {
        try {
            int width = 300, height = 300;
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

            ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream);

            String base64 = Base64.getEncoder().encodeToString(pngOutputStream.toByteArray());
            model.addAttribute("image", base64);
            model.addAttribute("text", text);

        } catch (WriterException | IOException e) {
            model.addAttribute("error", "Failed to generate QR code: " + e.getMessage());
        }
        return "index";
    }
}
