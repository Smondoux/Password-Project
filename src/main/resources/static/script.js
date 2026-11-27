const output = document.getElementById("generate-output");
const outputLength = document.getElementById("generate-length");

document.getElementById("generate-button").onclick = async () => {
    try {
        const response = await fetch("/password");
        if (!response.ok) throw new Error();
        const password = await response.text();
        
        output.textContent = "";

        // Append each character of the generated password to a span so we can style each one
        for (const character of password) {
            const span = document.createElement("span");
            span.textContent = character;

            const numbersRegex = /[0-9]/;
            const symbolsRegex = /[^a-zA-Z0-9]/; // Technically this is a "not numbers or english letters" regex
            if (numbersRegex.test(character)) {
                span.style.color = "blue";
            } else if (symbolsRegex.test(character)) {
                span.style.color = "red";
            }

            output.appendChild(span);
        }

        // TODO: Possibly add a "copy password" button

        // Optionally, a slider to choose password length would be cool
        let passwordLength = output.children.length;
        outputLength.textContent = `Length: ${passwordLength} characters`;
    } catch {
        output.textContent = "Error generating password.";
    }
};