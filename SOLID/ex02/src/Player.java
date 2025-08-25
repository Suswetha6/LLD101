public class Player {
    private final Decoder decoder;
    private final IRender renderer;
    private final ICache cache;

    public Player(Decoder decoder, IRender renderer, ICache cache) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.cache = cache;
    }

    public void play(byte[] fileBytes) {
        Frame frame = decoder.decode(fileBytes);
        renderer.render(frame);
        cache.store(frame);
        System.out.println("Cached last frame? " + (cache.getLast() != null));
    }
} 