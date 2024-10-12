module.exports = {
  plugins: {
    tailwindcss: {},
    autoprefixer: {},
    safelist: [
      'rounded-full', // Ensures this class is not purged
    ],
  },
}

