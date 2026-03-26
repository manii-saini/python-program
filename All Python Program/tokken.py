import tokenize
from io import BytesIO

def count_tokens(code):
    tokens = list(tokenize.tokenize(BytesIO(code.encode('utf-8')).readline))
    filtered_tokens = [t for t in tokens if t.type not in {tokenize.ENDMARKER, tokenize.ENCODING, tokenize.NEWLINE, tokenize.NL}]
    token_count = len(filtered_tokens)
    return token_count, filtered_tokens

if __name__ == "__main__":
    print("Enter your Python code snippet (end with an empty line):")
    user_code = "\n".join(iter(input, ""))
    
    token_count, tokens = count_tokens(user_code)
    print("\nTotal tokens in the given code:", token_count)
    
    print("\nTokens:")
    for token in tokens:
        print(token)
