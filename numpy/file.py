import os
import sys


class SmaliParser:

    def parse(self, smali_file):
        """
        Safely parse a smali file using UTF-8 decoding.
        Prevents UnicodeDecodeError on Windows.
        """

        try:
            # Binary read + manual UTF-8 decode (most robust)
            with open(smali_file, "rb") as f:
                content = f.read().decode("utf-8", errors="ignore")
                lines = content.splitlines()

            return lines

        except Exception as e:
            print(f"[!] Error reading {smali_file}: {e}")
            return []


class AnalysisEngine:

    def _init_(self):
        self.parser = SmaliParser()

    def analyze_smali_directory(self, directory):
        """
        Traverse decompiled APK folder and analyze all .smali files
        """

        print(f"[+] Scanning directory: {directory}")

        total_files = 0

        for root, dirs, files in os.walk(directory):
            for file in files:
                if file.endswith(".smali"):
                    smali_path = os.path.join(root, file)

                    methods = self.parser.parse(smali_path)

                    # Example: print number of lines (replace with your SMT logic)
                    print(f"[+] Parsed {smali_path} | Lines: {len(methods)}")

                    total_files += 1

        print(f"\n[✔] Total smali files analyzed: {total_files}")

    def analyze(self, input_path):
        """
        Main analysis function.
        Accepts either:
        - Decompiled APK folder
        - Raw APK (warns user)
        """

        if os.path.isdir(input_path):
            self.analyze_smali_directory(input_path)

        elif input_path.endswith(".apk"):
            print("\n[!] You provided an APK file.")
            print("[!] Please decompile it first using:")
            print("    apktool d app-debug.apk")
            print("[!] Then run script on the output folder.\n")

        else:
            print("[!] Invalid input path.")


if _name_ == "_main_":

    if len(sys.argv) != 2:
        print("Usage:")
        print("    python file2.py <decompiled_apk_folder>")
        sys.exit(1)

    engine = AnalysisEngine()
    engine.analyze(sys.argv[1])